package com.patterns.decorator.example2;

public class Demo {
    public static void main(String args[]) {
        IceCream icecream = new NutsToppingDecorator(new VanillaIceCream());
        System.out.println(icecream.getDescription());

        IceCream iceCream1 = new HoneyToppingDecorator(new NutsToppingDecorator( new ChocolateIceCream()));
        System.out.println(iceCream1.getDescription());
    }
}
