package com.ecomify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "products")
public class Product  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;


    @Column(name = "imgUrl")
    private String imgUrl;


    // Category Relation
    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;


    // Size Relation
    @ManyToMany()
    @JoinTable(name = "product_sizes",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "size_id")})
    private Set<Size> sizes =new HashSet<>();


    // Color Relation
    @ManyToMany()
    @JoinTable(name = "product_colors",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "color_id")})
    private Set<Size> colors =new HashSet<>();





}
