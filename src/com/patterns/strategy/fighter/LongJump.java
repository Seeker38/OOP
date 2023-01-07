package com.patterns.strategy.fighter;

class LongJump implements JumpBehavior {
    public void jump() {
        System.out.println("Long Jump");
    }
}