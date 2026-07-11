package spring.demo.mysql.mapper;

import spring.demo.mysql.dto.UserDto;
import spring.demo.mysql.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(user.getId(), user.getName(), user.getEmail());
        return userDto;
    }


    public static User mapToUser(UserDto userDto) {
        User user = new User(userDto.getId(), userDto.getName(), userDto.getEmail());
        return user;
    }
}
