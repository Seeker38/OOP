package com.patterns.strategy.fighter;

class TornadoKick implements KickBehavior {
    public void kick() {
        System.out.println("Tornado Kick");
    }
}