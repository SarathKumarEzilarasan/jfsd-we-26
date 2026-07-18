package spring.demo.mysql.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        description = "UserDTO Model Information"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @Schema(
            description = "User Name"
    )
    @NotEmpty(message = "Name should not be empty!!!")
    private String name;
    @Schema(
            description = "User Email"
    )
    @NotEmpty(message = "Email should not be empty!!!")
    @Email
    private String email;
}
