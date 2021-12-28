package org.example.cartservice.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne
    private SuperCategory superCategory;

}
