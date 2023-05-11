package vn.smarthomeapiadmin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Data // lombok giúp generate các hàm constructor, get, set v.v.
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productImageId;

    @Column(name = "url_Image", columnDefinition = "nvarchar(21845)")
    private String image;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}