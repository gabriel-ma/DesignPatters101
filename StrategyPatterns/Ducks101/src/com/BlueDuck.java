package com;

import com.interfaces.FlyBehavior;

public class BlueDuck extends Ducks{

    public BlueDuck(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void quack(){

    }

    public void poop() {
        System.out.println("Estou cagando hein!");
    }
}
