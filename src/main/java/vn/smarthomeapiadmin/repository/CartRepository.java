package vn.smarthomeapiadmin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.smarthomeapiadmin.entity.Cart;
import vn.smarthomeapiadmin.entity.Product;
import vn.smarthomeapiadmin.entity.User;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    List<Cart> findByUserId(int id);

    List<Cart> findByUser(User user);
    Cart findByUserAndProduct(User user, Product product);

//    CartItem findByCartCartIdAndProductsProductId(int cartId, int productId);

//    @Query("SELECT ci FROM CartItem ci WHERE ci.cart.cartId = :cartId AND ci.products.productId = :productId")
//    CartItem findByCartIdAndProductId(@Param("cartId") int cartId, @Param("productId") int productId);
}