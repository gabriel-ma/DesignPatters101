package com.thohughtworks.ducks.models;

import com.thohughtworks.ducks.fly.FlyBehavior;

public class Duck {

    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }
}
