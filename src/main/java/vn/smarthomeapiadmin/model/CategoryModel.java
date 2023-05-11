package vn.smarthomeapiadmin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.smarthomeapiadmin.entity.Product;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {

    private Integer categoryId;
    private String name;
    private String description;
    private String image;
    private List<Product> products;
}
