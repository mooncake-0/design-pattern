package behavioral.strategy;

import behavioral.strategy.intf.FlyBehavior;
import behavioral.strategy.intf.QuackBehavior;
import behavioral.strategy.intf.impl.FlyWithWings;
import behavioral.strategy.intf.impl.QuackNormal;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /*
     생성시점에 Composition 방식으로 사용할 구현체들을 등록할 수 있다
     > Client 가 직접 선택하는 방식
     */
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackNormal();
    }


    /*
     외부에서 Dependency 방식으로 구현체를 주입해주는 것을 Dependency Injection(DI) 이라고 부른다
     > 이와 같은 방식을 하면 Client 는 어떤 Impl 을 사용하는지 아예 모를 수 있는 장점
     */
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("Shows Mallard Duck");
    }


    /*
     Interface 에게 해당 Behavior 의 수행을
     각자 알고리즘대로 수행하도록 위임한다
     */
    @Override
    public void fly() {
        this.flyBehavior.fly();
    }

    @Override
    public void quack() {
        this.quackBehavior.quack();
    }


    /*
     Setter 를 통해 애플리케이션 Run-Time 시에도
     필요에따라 구현체를 바꿔줄 수 있다
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
