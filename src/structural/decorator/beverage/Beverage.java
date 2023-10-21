package structural.decorator.beverage;

public abstract class Beverage {

    protected String desc = "BEVERAGE";

    public String getDesc() {
        return this.desc;
    }

    // Decorator Pattern 을 적용하여 기능을 수행할 수 있다
    public abstract double cost();
}
