package org.example.cartservice.controller;

import org.example.cartservice.model.Category;
import org.example.cartservice.service.CategoryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/category")
public class  CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody Category category) {
        service.create(category);
    }

    @GetMapping
    public List<Category> getAll() {
        return service.getAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Category get(@PathVariable Long id) {
        return service.getById(id);
    }

//    @DeleteMapping
//    @RequestMapping("{test}")
//    public void delete(@PathVariable Long test) {
//        service.deleteById(test);
//    }

}
