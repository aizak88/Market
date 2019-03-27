package kg.itrun.market.demo.repository;

import kg.itrun.market.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
