package com.company;

public class Main {

    public static void main(String[] args) {
	    IceCream iceCream = new StrawberryDecorator(new ChocolateDecorator(new SimpleIceCream()));

        System.out.println("Your order is:");
        System.out.println(iceCream.description());
        System.out.println(iceCream.cost() + " KZT");
    }
}
