package com;

import com.behavior.Fly;

public class Main {
    public static void main(String[] args) {

        BlackDuck blackDuck = new BlackDuck(new Fly());
        blackDuck.fly();
        blackDuck.quack();

        System.out.println("---");

        WhiteDuck whiteDuck = new WhiteDuck(flyBehavior);
        whiteDuck.fly();
        whiteDuck.quack();

        System.out.println("---");

        BlueDuck blueDuck = new BlueDuck(flyBehavior);
        blueDuck.fly();
        blueDuck.quack();
        blueDuck.poop();

        System.out.println("---");

        ColorfulDuck colorfulDuck = new ColorfulDuck(flyBehavior);
        colorfulDuck.fly();
        colorfulDuck.quack();
        colorfulDuck.poop();

        System.out.println("---");


    }
}
