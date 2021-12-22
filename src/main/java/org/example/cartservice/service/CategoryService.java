package org.example.cartservice.service;

import org.example.cartservice.model.Category;
import org.example.cartservice.repository.CategoryRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void create(Category category) {
        repository.save(category);
    }

    public List<Category> getAll() {
        return repository.findAll();
    }

    public Category getById(Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
