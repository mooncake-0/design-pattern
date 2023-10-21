package structural.decorator.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        super.desc = "DECAF";
    }

    // 자신의 추가되는 가격을 반환한다
    @Override
    public double cost() {
        return 0.99;
    }
}
