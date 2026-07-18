package com.example.todo_management.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, UserDetailsService userDetailsService) {
        httpSecurity.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorise -> {
                    authorise.anyRequest().authenticated();
                    authorise.requestMatchers(HttpMethod.POST, "/api/**").hasRole("ADMIN");
                    authorise.requestMatchers(HttpMethod.PUT, "/api/**").hasRole("ADMIN");
                    authorise.requestMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN");
                    authorise.requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("ADMIN", "USER");
                    authorise.requestMatchers(HttpMethod.PATCH, "/api/**").hasRole("ADMIN");
                })
                .userDetailsService(userDetailsService)
                .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) { // Injected passwordEncoder here
        UserDetails john = User.builder()
                .username("john")
                .password(passwordEncoder.encode("password")) // Use the injected parameter
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("admin")) // Use the injected parameter
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(john, admin);
    }

}
