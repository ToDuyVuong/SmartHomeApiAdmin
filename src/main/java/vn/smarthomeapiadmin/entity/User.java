package vn.smarthomeapiadmin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data // lombok giúp generate các hàm constructor, get, set v.v.
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id()
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

//    @Id()
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;



    @Column(name = "user_Name", columnDefinition = "nvarchar(1111)")
    private String username;

    @Column(name = "password",columnDefinition = "nvarchar(1111)")
    private String password;

    @Column(name = "avatar", columnDefinition = "nvarchar(1111)")
    private String avatar;

    @Column(name = "gender", columnDefinition = "nvarchar(1111)")
    private String gender;

    @Column(name = "email", columnDefinition = "nvarchar(1111)")
    private String email;

    @Column(name = "phone_Number", columnDefinition = "nvarchar(1111)")
    private String phoneNumber;

    @Column(name = "address", columnDefinition = "nvarchar(1111)")
    private String address;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Order> order;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Cart> cart;
}
