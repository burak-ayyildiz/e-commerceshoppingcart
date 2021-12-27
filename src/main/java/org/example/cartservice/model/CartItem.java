package org.example.cartservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class CartItem {
    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    @OneToOne
    private Product product;
}
