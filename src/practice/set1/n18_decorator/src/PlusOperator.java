package practice.set1.n18_decorator.src;

public class PlusOperator extends Operator{

    public PlusOperator(IntegerValue left, IntegerValue right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return super.left.calculate() + super.right.calculate();
    }
}
