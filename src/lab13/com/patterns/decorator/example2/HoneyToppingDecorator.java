package com.patterns.decorator.example2;

public class HoneyToppingDecorator extends ToppingDecorator {

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " add more honey";
    }
}
