package practice.set1.n18_decorator.src;

/*
 묶어주기 위한 최상위 클래스 준비
 - 상속관계를 잘 이어야 한다
 - default constructor 에 필요한건 concrete 한 자식에게 주는게 좋은 형태
 - 단, 전체적으로 붙일 일은 추상화해서 제시해 놓는게 좋다
 */
public abstract class IntegerValue {

    protected int value;

    public abstract int calculate();
}
