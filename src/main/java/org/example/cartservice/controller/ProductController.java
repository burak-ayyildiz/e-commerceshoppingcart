package org.example.cartservice.controller;

import org.example.cartservice.dto.ProductDTO;
import org.example.cartservice.model.Product;
import org.example.cartservice.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody Product product) {
        service.save(product);
    }

    @GetMapping
    public List<Product> getAll(@RequestParam Optional<Long> categoryId) {
        return service.getAll(categoryId);
    }

    @GetMapping
    @RequestMapping("{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping
    public void put(@RequestBody Product product) {
        service.update(product);
    }
}
