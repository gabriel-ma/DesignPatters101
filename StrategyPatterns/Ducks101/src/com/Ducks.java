package com;

import com.interfaces.FlyBehavior;

public class Ducks {

    private FlyBehavior flyBehavior;

    public Ducks(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        System.out.println("quack!");

    }
}
