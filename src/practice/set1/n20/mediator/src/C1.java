package practice.set1.n20.mediator.src;

public class C1 extends C{

    public C1(String state, StateMediator stateMediator) {
        super(state, stateMediator);
        super.stateMediator.setC1(this);
    }
}
