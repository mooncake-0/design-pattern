package practice.set1.n20.mediator;

import practice.set1.n20.mediator.src.*;

public class N20Test2 {

    public static void main(String[] args) {


        StateMediator stateMediator = new CStateMediator();
        C c1 = new C1("C1 State", stateMediator);
        C c2 = new C2("C2 State", stateMediator);
        C c3 = new C3("C3 State", stateMediator);

        printAll(c1, c2, c3);

        c1.setState("C1 Changed State! C2 Will be Changed");
        printAll(c1, c2, c3);


        c3.setState("C3 Changed State! All Will be Changed");
        printAll(c1, c2, c3);
    }

    private static void printAll(C c1, C c2, C c3) {
        System.out.println("c1.getState() = " + c1.getState());
        System.out.println("c2.getState() = " + c2.getState());
        System.out.println("c3.getState() = " + c3.getState());
        System.out.println("========================");
    }
}
