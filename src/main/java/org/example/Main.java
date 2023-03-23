package org.example;

import lombok.val;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static List<Order> listOrder = new ArrayList<>();
    public static void main(String[] args) {
        Product P1 = new Product(4556789l, "Prodotto 1", "Book", 45.45);
        Product P2 = new Product(41234l, "Prodotto 2", "Baby", 42.52);
        Product P3 = new Product(64589l, "Prodotto 3", "Boys", 15.00);
        Product P4 = new Product(91459l, "Prodotto 4", "Book", 23.12);
        Product P5 = new Product(3425132l, "Prodotto 5", "Book", 102.43);
        Product P6 = new Product(3214589799l, "Prodotto 6", "Baby", 9.25);
        Product P7 = new Product(1234569l, "Prodotto 7", "Boys", 31.52);
        Customer C1 = new Customer(12l, "Vincenzo", 2);
        Customer C2 = new Customer(56l, "Marco", 1);
        Customer C3 = new Customer(78l, "Giorgio", 2);
        Customer C4 = new Customer(5l, "Luca", 2);
        Order O1 = new Order(1l, "Ricevuto","12/02/2021" , "12/02/2022", C1, P1);
        Order O2 = new Order(2l, "Ricevuto","01/02/2021" , "23/06/2022", C2, P2);
        Order O3 = new Order(3l, "Ricevuto","19/02/2021" , "01/03/2022", C3, P3);
        Order O4 = new Order(4l, "Ricevuto","13/02/2021" , "05/08/2022", C4, P4);
        Order O5 = new Order(6l, "Ricevuto","24/02/2021" , "03/10/2022", C1, P5);
        Order O6 = new Order(7l, "Ricevuto","25/01/2021" , "02/09/2022", C1, P6);
        Order O7 = new Order(8l, "Ricevuto","31/05/2021" , "15/04/2022", C2, P7);
        addToListOrder(O1);
        addToListOrder(O2);
        addToListOrder(O3);
        addToListOrder(O4);
        addToListOrder(O5);
        addToListOrder(O6);
        addToListOrder(O7);

        System.out.println("Esercizio 1 per categoria e prezzo");
        Order.ricercaProdotto("Book", 100);
        System.out.println("Esercizio 2 solo per categoria");
        Order.ricercaProdotto("Baby");
        System.out.println("Esercizio 3 sconto del 10%");
        Order.applicaSconto("Boys", 10);




    }
    public static void addToListOrder (Order order) {
        listOrder.add(order);
    }

}