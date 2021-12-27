package org.example.cartservice.service;

import org.example.cartservice.model.CartItem;
import org.example.cartservice.model.Orders;
import org.example.cartservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Orders create (Orders orders){
        double totalPrice =0.;
        for (CartItem cartItem : orders.getCart().getCartItems() ) {
            totalPrice += cartItem.getQuantity()*cartItem.getProduct().getPrice();

        }orders.setTotalPrice(totalPrice);
        return repository.save(orders);
    }

    public  Orders getById (Long id ){
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

}
