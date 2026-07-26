package com.thymeleaf.com.thymeleaf.login.repository;

import com.thymeleaf.com.thymeleaf.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
