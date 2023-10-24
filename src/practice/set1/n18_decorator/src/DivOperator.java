package practice.set1.n18_decorator.src;

public class DivOperator extends Operator {

    public DivOperator(IntegerValue left, IntegerValue right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        if (super.right.calculate() == 0) throw new RuntimeException("잘못된 연산입니다");
        return super.left.calculate() / super.right.calculate();
    }
}
