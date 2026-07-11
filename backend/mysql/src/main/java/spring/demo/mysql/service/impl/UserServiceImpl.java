package spring.demo.mysql.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.demo.mysql.dto.UserDto;
import spring.demo.mysql.entity.User;
import spring.demo.mysql.mapper.UserMapper;
import spring.demo.mysql.repository.UserRepository;
import spring.demo.mysql.service.UserService;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId).get();
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::mapToUserDto).toList();
    }

    @Override
    public UserDto updateUser(UserDto userDto, Long userId) {
        User user = UserMapper.mapToUser(userDto);
        User existingUser = userRepository.findById(userId).get();
        existingUser.setEmail(user.getEmail());
        existingUser.setName(user.getName());
        User updatedUser = userRepository.save(existingUser);
        return UserMapper.mapToUserDto(updatedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
