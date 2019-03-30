package com.company;

import java.util.List;

public class Invoice {
    private List<Product> products;
    private String dapostoli;
    private String dpliromi;
    private double pliromi;
    private double ipolipo = 0;

    public Invoice(List<Product> products, String dapostoli, String dpliromi, double pliromi) {
        this.products = products;
        this.dapostoli = dapostoli;
        this.dpliromi = dpliromi;
        this.pliromi = pliromi;

        for (Product product: products) {
            ipolipo += product.getPrice();
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getDapostoli() {
        return dapostoli;
    }

    public String getDpliromi() {
        return dpliromi;
    }

    public double getPliromi() {
        return pliromi;
    }

    public double getIpolipo() {
        return ipolipo;
    }
}
