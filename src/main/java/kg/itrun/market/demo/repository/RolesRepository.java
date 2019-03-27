package kg.itrun.market.demo.repository;

import kg.itrun.market.demo.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository <Roles, Integer> {
}
