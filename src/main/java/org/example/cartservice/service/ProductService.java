package org.example.cartservice.service;

import org.example.cartservice.dto.ProductDTO;
import org.example.cartservice.model.Category;
import org.example.cartservice.model.Product;
import org.example.cartservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.example.cartservice.dto.ProductDTO.ProductDTOBuilder.aProductDTO;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void save(ProductDTO productDTO) {
        Product product = new Product();
        Category category = new Category();
        category.setId(productDTO.getCategoryDTO().getId());
        product.setCategory(category);
        product.setPrice(productDTO.getPrice());
        product.setName(productDTO.getName());
        repository.save(product);
    }

    public List<Product> getAll(Optional<Long> categoryId) {

        if (categoryId.isPresent()) {
            return repository.findAllByCategoryId(categoryId.get());
        }

        return repository.findAll();
    }

    public ProductDTO getById(Long id) {
        Product product = repository.findById(id).orElseThrow(RuntimeException::new);
        return aProductDTO().id(product.getId()).price(product.getPrice()).name(product.getName()).build();

    }

    public void update(Product product) {
        repository.save(product);
    }
}
