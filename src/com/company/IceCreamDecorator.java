package com.company;

public class IceCreamDecorator implements IceCream{
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String description() {
        return iceCream.description();
    }

    @Override
    public double cost() {
        return iceCream.cost();
    }
}
