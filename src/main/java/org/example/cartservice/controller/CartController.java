package org.example.cartservice.controller;

import org.example.cartservice.model.Cart;
import org.example.cartservice.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carts")
public class CartController {


    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @PostMapping
    public Cart post(@RequestBody Cart cart){
        return cartService.save(cart);
    }

    @GetMapping
    @RequestMapping("{id}")
    public Cart getById(@PathVariable Long id){
        return cartService.getById(id);

    }
    @PutMapping
    public void put(@RequestBody Cart cart){
        cartService.save(cart);
    }
}
