package com.company;

public class StrawberryDecorator extends IceCreamDecorator{
    public StrawberryDecorator(IceCream iceCream) {
        super(iceCream);
    }

    String addStraberries(){
        return " + strawberries";
    }

    @Override
    public String description() {
        return super.description() + addStraberries();
    }

    @Override
    public double cost() {
        return super.cost()+100;
    }
}
