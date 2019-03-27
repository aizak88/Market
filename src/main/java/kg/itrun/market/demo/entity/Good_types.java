package kg.itrun.market.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "good_types")
public class Good_types {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "good_type_id")
    private int id;
    private String type_name;
    private int is_active;


}
