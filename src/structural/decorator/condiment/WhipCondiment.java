package structural.decorator.condiment;

import structural.decorator.CondimentDecorator;
import structural.decorator.beverage.Beverage;

public class WhipCondiment extends CondimentDecorator {

    // 자신이 Wrap 하려는 객체를 알고 있어야 한다
    public WhipCondiment(Beverage beverage) {
        super.beverage = beverage;
    }

    // Decorate 하는 객체가 하려는 책임에 자신의 책임을 더해준다
    @Override
    public String getDesc() {
        return super.beverage.getDesc() + " , Whip";
    }


    // Decorate 하는 객체가 하려는 책임에 자신의 책임을 더해준다
    @Override
    public double cost() {
        return super.beverage.cost() + 0.5;
    }
}
