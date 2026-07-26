package com.thymeleaf.com.thymeleaf.login.service.impl;

import com.thymeleaf.com.thymeleaf.login.dto.UserDto;
import com.thymeleaf.com.thymeleaf.login.entity.Role;
import com.thymeleaf.com.thymeleaf.login.entity.User;
import com.thymeleaf.com.thymeleaf.login.repository.RoleRepository;
import com.thymeleaf.com.thymeleaf.login.repository.UserRepository;
import com.thymeleaf.com.thymeleaf.login.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private ModelMapper modelMapper;

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);

        Role role = roleRepository.findByName("ROLE_ADMIN");
        if (role == null) {
            role = new Role();
            role.setName("ROLE_ADMIN");
            roleRepository.save(role);
        }

        user.setRoles(Arrays.asList(role));
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public UserDto findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return null;
        }
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> modelMapper.map(user, UserDto.class)).toList();
    }
}
