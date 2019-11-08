package com.thohughtworks.ducks;

import com.thohughtworks.ducks.fly.NoFly;
import com.thohughtworks.ducks.fly.SimpleFly;
import com.thohughtworks.ducks.models.Duck;
import com.thohughtworks.ducks.fly.FlyBehavior;

public class main {

    public static void main(String[] args) {

        FlyBehavior simpleFlyBehavior = new SimpleFly();
        Duck simpleDuck = new Duck(simpleFlyBehavior);

        simpleDuck.fly();

        FlyBehavior noFlyBehavior = new NoFly();
        Duck rubberDuck = new Duck(noFlyBehavior);
        rubberDuck.fly();

    }
}
