package com.patterns.decorator.example2;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream){
        super(iceCream);
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " add more nuts";
    }
}
