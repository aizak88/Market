package kg.itrun.market.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "prices")
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "price_id")
    private int id;
    private int price;
    private Date start_date;
    private Date end_date;
}
