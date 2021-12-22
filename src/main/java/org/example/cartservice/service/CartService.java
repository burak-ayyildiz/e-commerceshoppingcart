package org.example.cartservice.service;

import org.example.cartservice.model.Cart;
import org.example.cartservice.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    public Cart getById(Long id) {
       return cartRepository.findById(id).orElseThrow(RuntimeException::new);

    }
}
