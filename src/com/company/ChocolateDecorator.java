package com.company;

public class ChocolateDecorator extends IceCreamDecorator{
    public ChocolateDecorator(IceCream iceCream) {
        super(iceCream);
    }

    String addChocolate(){
        return " + chocolate syrup";
    }

    @Override
    public String description() {
        return super.description() + addChocolate();
    }

    @Override
    public double cost() {
        return super.cost() + 50;
    }
}
