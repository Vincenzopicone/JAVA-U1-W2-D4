package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {
    public long id;
    public String status;
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    public static List<Product> products = new ArrayList<>();
    public Customer costumer;


    public Order (Long id, String status, String orderDate, String deliveryDate, Customer costumer, Product prodotto) {
        this.id = id;
        this.status = status;
        this.orderDate = dateInput(orderDate);
        this.deliveryDate = dateInput(deliveryDate);
        this.costumer = costumer;
        addProducts(prodotto);
    }
    public static void addProducts (Product prodotto) {
        products.add(prodotto);
    }
    public static LocalDate dateInput(String data) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(data, dateFormat);
        return date ;
    }

    public static void ricercaProdotto (String string, double n) {
        products.stream()
                .filter(x -> x.category.equals(string))
                .filter(x->x.price < n)
                .forEach(x->System.out.println(" Id: " + x.id + " Nome: " + x.name + " Prezzo: " + x.price + "€" + " Catgoria: " + x.category ));
    }
    public static void ricercaProdotto (String string) {
        products.stream()
                .filter(x -> x.category.equals(string))
                .forEach(x->System.out.println(" Id: " + x.id + " Nome: " + x.name + " Prezzo: " + x.price + "€" + " Catgoria: " + x.category ));
    }

    public static void applicaSconto (String cat, double sconto) {
        products.stream()
                .filter(x -> x.category.equals(cat))
                .map(x->x.price = x.setPrice(sconto))
                .forEach(x->System.out.println(x));
        /*for (int i = 0; i < products.size(); i++) {
            System.out.println(" Id: " + products.get(i).id + " Nome: " + products.get(i).name + " Prezzo: " + products.get(i).price + "€" + " Catgoria: " + products.get(i).category );
        }*/
    }




}
