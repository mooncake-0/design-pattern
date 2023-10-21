package behavioral.strategy.intf.impl;

import behavioral.strategy.intf.QuackBehavior;

public class QuackNormal implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK~!");
    }
}
