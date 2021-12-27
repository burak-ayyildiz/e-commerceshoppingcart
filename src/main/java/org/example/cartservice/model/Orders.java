package org.example.cartservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue
    private Long id;


    private double totalPrice;

    private String deliveryAdress;
    private String paymentMethod;
    private String deliveryMod;

    @OneToOne
    private Cart cart;

}
