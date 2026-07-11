package spring.demo.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.demo.mysql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
