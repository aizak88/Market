package kg.itrun.market.demo.repository;

import kg.itrun.market.demo.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
}
