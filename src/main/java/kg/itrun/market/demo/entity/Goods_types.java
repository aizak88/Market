package kg.itrun.market.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "goods_types")
public class Goods_types {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goods_type_id")
    private int id;
    private String type_name;
    private int is_active;


}
