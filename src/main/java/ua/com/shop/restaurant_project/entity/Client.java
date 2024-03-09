package ua.com.shop.restaurant_project.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "clients")
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private int phone;

    private String email;

    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "id")
    private Users user;

    @OneToMany(mappedBy ="clientes")
    private List<Address> addressList;

    @OneToMany(mappedBy = "client")
    private List<Order> orderList;
}