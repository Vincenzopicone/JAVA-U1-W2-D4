package org.example;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Product {
    public Long id;
    public String name;
    public String category;
    public Double price;

    public Product(Long id, String name, String category, Double price){
        this.id = id;
        this.name= name;
        this.category = category;
        this.price = price;
    }

    public double setPrice (double sconto) {
        this.price =this.price - (this.price * sconto)/ 100;
        return this.price;
    }



}
