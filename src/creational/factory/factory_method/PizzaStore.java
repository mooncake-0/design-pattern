package creational.factory.factory_method;

/*
 생성 함수를 가진 곳과 생성을 하는 곳을 합친다
 > 그리고 이 합친 곳을 abstract 로 하여, extend 받을 수 있게 한다
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();

        return pizza;
    }


    /*
     Sub Class 들이 원하는대로 Pizza 를 생성할 수 있는 틀을 마련해준다
     */
    protected abstract Pizza createPizza(String type);
}
