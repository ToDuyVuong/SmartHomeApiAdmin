package vn.smarthomeapiadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.smarthomeapiadmin.entity.Category;
import vn.smarthomeapiadmin.entity.ProductImage;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
//    private Integer productId;
//    private String name;
//    private String description;
//    private List<ProductImage> images;
//    private Long price;
//    private int quantity;
//    private Category category;
//    private int active;
//    private Date createdDate;
//    private int sold;
////    private List<OrderItem> orderItems;

    private Integer productId;
    private String name;
    private String description;
    private Long price;
    private int quantity;
    private int active;
    private Date createdDate;
    private int sold;
    private List<ProductImage> images;
    private Category category;
//    private List<OrderItem> orderItems;
}