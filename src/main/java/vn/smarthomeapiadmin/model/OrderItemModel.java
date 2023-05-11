package vn.smarthomeapiadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.smarthomeapiadmin.entity.Order;
import vn.smarthomeapiadmin.entity.Product;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemModel {

    private Integer orderItemId;
    private int quantity;
    private Long price;
    private Product product;
    private Order order;
}
