package behavioral.strategy.intf.impl;

import behavioral.strategy.intf.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not Able To Fly");
    }
}
