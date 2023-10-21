package structural.decorator;

import structural.decorator.beverage.Beverage;
import structural.decorator.beverage.Espresso;
import structural.decorator.condiment.MochaCondiment;
import structural.decorator.condiment.WhipCondiment;

public class DecoratorTest {

    public static void main(String [] args) {

        Beverage beverage = new Espresso();

        System.out.println(beverage.getDesc());
        System.out.println(beverage.cost() + "");

        beverage = new WhipCondiment(beverage);

        System.out.println(beverage.getDesc());
        System.out.println(beverage.cost() + "");

        beverage = new MochaCondiment(beverage);

        System.out.println(beverage.getDesc());
        System.out.println(beverage.cost() + "");

    }
}
