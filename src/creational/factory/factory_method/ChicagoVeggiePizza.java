package creational.factory.factory_method;

public class ChicagoVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("시카고 채소 피자를 만듭니다");
    }
}
