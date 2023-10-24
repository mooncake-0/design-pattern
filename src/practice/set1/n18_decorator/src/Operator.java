package practice.set1.n18_decorator.src;

public abstract class Operator extends IntegerValue{

    // Decorator Pattern 에서 가장 중요한 상속과 Shared Aggregation 으로 묶기
    protected IntegerValue left;
    protected IntegerValue right;

    public Operator(IntegerValue left, IntegerValue right) {
        this.left = left;
        this.right = right;
    }
}
