package org.example.cartservice.mapper;

import lombok.Data;
import org.example.cartservice.dto.ProductDTO;
import org.example.cartservice.model.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {
    ProductDTO convert (Product product);

}
