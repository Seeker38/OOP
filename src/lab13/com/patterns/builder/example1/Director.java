package com.patterns.builder.example1;

public class Director {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.TAKE_AWAY).orderBread(BreadType.BEEF)
                .orderSauce(SauceType.FISH_SAUCE).build();
        System.out.println(order);
    }
}
