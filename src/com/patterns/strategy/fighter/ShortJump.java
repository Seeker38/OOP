package com.patterns.strategy.fighter;

class ShortJump implements JumpBehavior {
    public void jump() {
        System.out.println("Short Jump");
    }
}