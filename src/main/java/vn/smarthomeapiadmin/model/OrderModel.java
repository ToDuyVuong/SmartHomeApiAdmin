package vn.smarthomeapiadmin.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.smarthomeapiadmin.entity.Order;
import vn.smarthomeapiadmin.entity.OrderItem;
import vn.smarthomeapiadmin.entity.User;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {

    private Integer orderId;
    private String date;
    private String shipTo;
    private Long totalPrice;
    private String note;
    private String address;
    private String phone;
    private Integer totalQuantity;
    private Order.Status status;
    private List<OrderItem> orderItems;
    private User user;

}
