package vn.smarthomeapiadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.smarthomeapiadmin.entity.Product;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImageModel {

    private Integer productImageId;
    private String image;
    private Product product;
}
