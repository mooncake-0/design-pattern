package creational.factory.factory_method;


/*
 생성을 필요로 하는 곳이 원하는 객체를 직접 제어할 수 있도록 한다
 SimpleFactory 에서는 Client 가 원하는 것을 제어할 수 없고 Method 가 있는 Factory Class 에만 의존해야 했다
 */
public class  ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        } else {
            pizza = null;
        }

        return pizza;
    }
}
