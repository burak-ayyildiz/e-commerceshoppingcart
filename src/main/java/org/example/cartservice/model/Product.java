package org.example.cartservice.model;

import lombok.Data;
import org.example.cartservice.dto.ProductDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    @OneToOne
    private Category category;

    public ProductDTO convertTo() {

        return new ProductDTO(this.id, this.name, this.price);

//        return ProductDTO.ProductDTOBuilder.aProductDTO()
//                .id(this.id)
//                .price(this.price)
//                .name(this.name)
//                .build();
    }

}
