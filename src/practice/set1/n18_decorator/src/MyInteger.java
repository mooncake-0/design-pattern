package practice.set1.n18_decorator.src;

public class MyInteger extends IntegerValue{

    /*
     최상단 Class 는 NoArgsConstructor 를 위해
     필요한 초기화는 각자 진행한다
     */
    public MyInteger(int value) {
        super.value = value;
    }

    @Override
    public int calculate() {
        return super.value;
    }
}
