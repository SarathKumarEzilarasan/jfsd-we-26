package spring.demo.mysql;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.demo.mysql.dto.UserDto;
import spring.demo.mysql.entity.User;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Rest API Documentation",
				description = "Spring Boot Student API's",
				version="v1.0",
				contact = @Contact(
						name = "John",
						email = "test@gmail.com",
						url = "https://www.google.com"
				)
		)
)
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
