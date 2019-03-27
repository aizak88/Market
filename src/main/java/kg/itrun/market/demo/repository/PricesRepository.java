package kg.itrun.market.demo.repository;

import kg.itrun.market.demo.entity.Prices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricesRepository extends JpaRepository<Prices, Integer> {
}
