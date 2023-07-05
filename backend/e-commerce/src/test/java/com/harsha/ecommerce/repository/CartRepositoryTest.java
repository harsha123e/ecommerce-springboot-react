package com.harsha.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.harsha.ecommerce.model.Cart;
import com.harsha.ecommerce.model.Product;
import com.harsha.ecommerce.model.User;

@DataJpaTest
public class CartRepositoryTest {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCartUserRelationship() {
        User user = new User();
        user.setUsername("JohnDoe");

        userRepository.save(user);

        Cart cart = new Cart();
        cart.setUser(user);

        cartRepository.save(cart);

        Cart savedCart = cartRepository.findById(cart.getID()).orElse(null);

        assertNotNull(savedCart);
        assertNotNull(savedCart.getUser());
        assertEquals(user.getUsername(), savedCart.getUser().getUsername());
    }

    @Test
    public void testCartProductRelationship() {
        // Create a Cart
        Cart cart = new Cart();

        // Create two Products
        Product product1 = new Product();
        product1.setName("Product 1");
        Product product2 = new Product();
        product2.setName("Product 2");

        // Set the Cart reference in each Product instance
        product1.setCart(cart);
        product2.setCart(cart);

        // Set the Products list in the Cart
        List<Product> products = List.of(product1, product2);
        cart.setProducts(products);

        // Save the Cart entity along with the associated Products
        cartRepository.save(cart);

        // Assertions
        assertNotNull(cart.getID());
        assertNotNull(product1.getID());
        assertNotNull(product2.getID());

        // Fetch the Cart from the database
        Cart savedCart = cartRepository.findById(cart.getID()).orElse(null);
        assertNotNull(savedCart);

        // Verify the relationship
        List<Product> savedProducts = savedCart.getProducts();
        assertNotNull(savedProducts);
        assertEquals(2, savedProducts.size());
        assertTrue(savedProducts.contains(product1));
        assertTrue(savedProducts.contains(product2));
    }

}
