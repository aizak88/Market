package kg.itrun.market.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goods_id")
    private int id;
    private String goods_name;
    private int is_active;
    private String info;

    @ManyToOne
    @JoinColumn(name = "price_id")
    private int price_id;

    @ManyToOne
    @JoinColumn(name = "good_type_id")
    private int good_type_id;
}