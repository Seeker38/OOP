package com.patterns.strategy.fighter;

class LightningKick implements KickBehavior {
    public void kick() {
        System.out.println("Lightning Kick");
    }
}