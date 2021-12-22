package org.example.cartservice.repository;

import org.example.cartservice.model.Cart;
import org.example.cartservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
