package vn.smarthomeapiadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.smarthomeapiadmin.entity.Product;
import vn.smarthomeapiadmin.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartModel {

    private Integer cartId;
    private int quantity;
    private User user;
    private Product product;
    private boolean selected;
}
