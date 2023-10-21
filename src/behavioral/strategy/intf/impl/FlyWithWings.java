package behavioral.strategy.intf.impl;

import behavioral.strategy.intf.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Start to Fly With Wings!");
    }
}
