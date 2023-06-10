package com.ecomify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    private String imgUrl;

    //@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
  //  private List<Product> products = new ArrayList<>();

    // getters and setters

}
