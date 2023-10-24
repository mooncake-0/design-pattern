package practice.set1.n18_decorator;

import practice.set1.n18_decorator.src.*;

import java.util.List;

public class N18Test {

    public static void main(String [] args) {
        IntegerValue totalVal1 = new MyInteger(3);

        IntegerValue totalVal2 = new PlusOperator(new MyInteger(2), new MyInteger(5));

        IntegerValue totalVal3 = new DivOperator(new MultiplyOperator(new PlusOperator(new MyInteger(4), new MyInteger(2))
                , new MinusOperator(new MyInteger(8), new MyInteger(1))), new MyInteger(2));

        List<IntegerValue> list = List.of(totalVal1, totalVal2, totalVal3);
        for (IntegerValue vals : list) {
            System.out.println(vals.calculate());
        }
    }
}
