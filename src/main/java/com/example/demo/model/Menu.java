package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "menu")
public class Menu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String item_name;
    private double item_price;

    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OrderCart> orderCart;

    public Menu(){
        // Default
    }

    public Menu(Integer id, String item_name, double item_price) {
        this.id = id;
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public Set<OrderCart> getOrderCart() {
        return orderCart;
    }

    public void setOrderCart(Set<OrderCart> orderCart) {
        this.orderCart = orderCart;
    }







}