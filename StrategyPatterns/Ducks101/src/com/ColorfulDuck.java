package com;

import com.interfaces.FlyBehavior;

public class ColorfulDuck extends Ducks {

    public ColorfulDuck(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    public void poop() {
        System.out.println("Estou cagando hein!");
    }
}
