package edu.lhub.home1;

import lombok.Data;

/**
 * Created by Ярослав on 10.06.2017.
 */
@Data
public class KitchenAppliances extends Technique {
    private Brand brand;
    private double price;
    private String description;

    public KitchenAppliances(Brand brand, double price, String description) {
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public KitchenAppliances() {
    }

    @Override
    protected void doWORK() {
        System.out.println("Work in kitchen");
    }
}
