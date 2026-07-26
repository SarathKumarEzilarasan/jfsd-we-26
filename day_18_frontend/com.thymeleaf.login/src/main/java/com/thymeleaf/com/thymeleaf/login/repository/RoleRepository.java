package com.thymeleaf.com.thymeleaf.login.repository;

import com.thymeleaf.com.thymeleaf.login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
