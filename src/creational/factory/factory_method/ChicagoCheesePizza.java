package creational.factory.factory_method;

public class ChicagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("시카고 치즈 피자를 만듭니다");
    }
}
