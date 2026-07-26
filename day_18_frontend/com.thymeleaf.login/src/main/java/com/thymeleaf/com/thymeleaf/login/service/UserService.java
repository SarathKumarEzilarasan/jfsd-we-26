package com.thymeleaf.com.thymeleaf.login.service;

import com.thymeleaf.com.thymeleaf.login.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
