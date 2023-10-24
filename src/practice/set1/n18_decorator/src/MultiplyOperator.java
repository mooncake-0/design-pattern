package practice.set1.n18_decorator.src;

public class MultiplyOperator extends Operator{

    public MultiplyOperator(IntegerValue left, IntegerValue right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return super.left.calculate() * super.right.calculate();
    }
}
