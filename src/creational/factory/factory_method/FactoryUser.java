package creational.factory.factory_method;

public class FactoryUser {

    public static void main(String []args){

        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza cheese = pizzaStore.orderPizza("cheese");
        Pizza veggie = pizzaStore.orderPizza("veggie");

    }
}
