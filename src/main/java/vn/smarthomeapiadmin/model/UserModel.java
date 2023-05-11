package vn.smarthomeapiadmin.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private String id;

    private String username;

    private String password;

    private String avatar;

    private String gender;

    private String email;

    private String phoneNumber;

    private String address;

}
