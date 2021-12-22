package org.example.cartservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class SuperCategory {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
