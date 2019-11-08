package com.thohughtworks.ducks.fly;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm falling because I don't fly");
    }
}
