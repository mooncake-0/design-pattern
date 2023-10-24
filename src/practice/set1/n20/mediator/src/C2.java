package practice.set1.n20.mediator.src;

public class C2 extends C {

    public C2(String state, StateMediator stateMediator) {
        super(state, stateMediator);
        super.stateMediator.setC2(this);
    }

}