package structural.decorator;

import structural.decorator.beverage.Beverage;

/*
 Beverage 와 같은 자격으로 Beverage 를 Wrap 하게 된다
 */
public abstract class CondimentDecorator extends Beverage {

    // 자신이 Wrap 하려는 객체를 알고 있어야 동일한 기능을 연이어 수행시켜줄 수 있다
    protected Beverage beverage;

    @Override
    public abstract String getDesc();

}
