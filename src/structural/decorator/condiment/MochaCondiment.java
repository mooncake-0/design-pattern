package structural.decorator.condiment;

import structural.decorator.CondimentDecorator;
import structural.decorator.beverage.Beverage;

public class MochaCondiment extends CondimentDecorator {

    public MochaCondiment(Beverage beverage) {
        super.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return super.beverage.getDesc() + ", Mocha";
    }

    @Override
    public double cost() {
        return super.beverage.cost() + 0.4;
    }
}
