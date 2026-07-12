package spring.demo.mysql;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.demo.mysql.dto.UserDto;
import spring.demo.mysql.entity.User;

@SpringBootApplication
public class MysqlApplication {

	@Bean
	public ModelMapper modelMapper(){
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.createTypeMap(UserDto.class, User.class)
//				.addMapping(UserDto::getId, User::setName);
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}

}
