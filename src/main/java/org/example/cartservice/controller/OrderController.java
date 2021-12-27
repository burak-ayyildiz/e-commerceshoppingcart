package org.example.cartservice.controller;

import org.example.cartservice.model.Orders;
import org.example.cartservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Orders create(@RequestBody Orders orders){
      return service.create(orders);
    }

    @GetMapping("{id}")
    public Orders getOrders(@PathVariable Long id){
        return service.getById(id);
    }
}
