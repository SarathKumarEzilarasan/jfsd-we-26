package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("demo")
@PropertySource("sports.properties")
public class SportsConfig {

    @Bean
    public List<Integer> list() {
        return Arrays.asList(1, 2, 3, 4);
    }
}
