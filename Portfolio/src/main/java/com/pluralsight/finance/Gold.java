package com.pluralsight.finance;

public class Gold extends FixedAsset{
    double weight;

    // Constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // Imported Method
    public double getValue() {
        return 0;
    }

    // Class Based Getters
    public double getWeight() {
        return weight;
    }
}
