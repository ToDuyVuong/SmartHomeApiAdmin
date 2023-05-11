package vn.smarthomeapiadmin.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orderitem")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderItemId;


    @Column(name = "quantity")
    private int quantity;

    @Column(name= "price")
    private Long price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", referencedColumnName = "product_id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_orderItem"))
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", referencedColumnName = "order_id", nullable = false, foreignKey = @ForeignKey(name = "FK_order_orderItem"))
    private Order order;

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", product=" + product +
                ", order=" + order +
                '}';
    }
}
