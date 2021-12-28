package org.example.cartservice.service;

import org.example.cartservice.dto.ProductDTO;
import org.example.cartservice.model.Product;
import org.example.cartservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void save(Product product) {
        repository.save(product);
    }

    public List<Product> getAll(Optional<Long> categoryId) {

        if (categoryId.isPresent()) {
            return repository.findAllByCategoryId(categoryId.get());
        }

        return repository.findAll();
    }

    public Product getById(Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void update(Product product) {
        repository.save(product);
    }
}
