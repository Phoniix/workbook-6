package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    double karat;

    // Constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    // Imported Methods
    public double getValue() {
        return 0;
    }
}
