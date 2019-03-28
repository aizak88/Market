package kg.itrun.market.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
    private String login;
    private String pwd;
    private String name;
    private String email;
    private String phone;
    private int is_active;
    @ManyToOne
    @JoinColumn(name = "role_id" )
    private Role role;

}
