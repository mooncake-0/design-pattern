package practice.set1.n20.observer.src;

public class C2 extends C implements Observer{

    public C2(String state) {
        super(state);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof C1) {
            C1 c1 = (C1) subject;
            super.setState(c1.getState());
        }
    }
}