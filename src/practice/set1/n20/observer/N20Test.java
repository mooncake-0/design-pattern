package practice.set1.n20.observer;

import practice.set1.n20.observer.src.C;
import practice.set1.n20.observer.src.C1;
import practice.set1.n20.observer.src.C2;
import practice.set1.n20.observer.src.C3;

public class N20Test {

    public static void main(String[] args) {

        // 각 함수들 각자에만 있음
        C1 c1 = new C1("C1 STATE!");
        C2 c2 = new C2("C2 STATE!");
        C3 c3 = new C3("C3 STATE!");
        printAll(c1, c2, c3);

        // c2 observes c1
        c1.registerObserver(c2);

        // c1 observes c3
        c3.registerObserver(c1);


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
