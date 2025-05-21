package com.pluralsight.finance;

public class House extends FixedAsset{
int yearBuilt;
int sqFeet;
int bedrooms;

    //Constructor
    public House(String name, double marketValue, int yearBuilt, int sqFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.sqFeet = sqFeet;
        this.bedrooms = bedrooms;
    }

    public double getValue() {
        return 0;
    }
}
