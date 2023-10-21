package behavioral.strategy.intf.impl;

import behavioral.strategy.intf.QuackBehavior;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Not Able to Make Sound");
    }
}
