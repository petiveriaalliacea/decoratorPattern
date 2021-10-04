package com.company;

public class SimpleIceCream implements IceCream{
    @Override
    public String description() {
        return "Simple ice cream";
    }

    @Override
    public double cost() {
        return 400;
    }
}
