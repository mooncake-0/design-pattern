package structural.decorator.beverage;

public class Espresso extends Beverage{

    public Espresso() {
        super.desc = "ESPRESSO";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
