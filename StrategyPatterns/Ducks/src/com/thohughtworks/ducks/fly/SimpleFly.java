package com.thohughtworks.ducks.fly;

public class SimpleFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm simple flying");
    }
}
