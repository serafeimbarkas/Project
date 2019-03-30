package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Nike Air Force 1", 89.99, 1));
        products.add(new Product("Adidas", 39.99, 2));
        products.add(new Product("Beneton", 29.99, 3));

            Invoice invoice = new Invoice(products, "Papasiopoulou 2", "Koumoundourou 34", 101);
        System.out.println("     INVOICE       ");
        System.out.println(invoice.getDapostoli());
        System.out.println(invoice.getDpliromi() + "\n");
        for (Product product: invoice.getProducts()) {
            System.out.println(product.getName() + " / " + product.getQuantity() + " / " + product.getPrice());
        }
        System.out.println("\n" + invoice.getPliromi());
        System.out.println(invoice.getIpolipo());
        System.out.println(-invoice.getPliromi() + invoice.getIpolipo());
    }
}
