package vn.smarthomeapiadmin.service;

import vn.smarthomeapiadmin.entity.Cart;
import vn.smarthomeapiadmin.entity.Product;
import vn.smarthomeapiadmin.entity.User;

import java.util.List;
import java.util.Optional;

public interface ICartService {

    void delete(Cart entity);

    void deleteById(Integer cartItemId);

    long count();

    Optional<Cart> findById(Integer cartItemId);

    void saveCartItem(Cart cartItemEntity);

    void deleteCartItemById(Integer cartItemId);

//    CartItem getCartItemByCartIdAndProductId(Integer cartId, Integer productId);
//
//    @Query("SELECT ci FROM CartItem ci WHERE ci.cart.cartId = :cartId AND ci.products.productId = :productId")
//    CartItem findByCartIdAndProductId(int cartId, int productId);

    List<Cart> getCartItemsByUserId(int id);

    List<Cart> findAll();

    List<Cart> findByUser(User user);

    Cart findByUserAndProduct(User user, Product product);

    <S extends Cart> S save(S entity);
}
