package practice.set1.n20.mediator.src;

public class C3 extends C {

    public C3(String state, StateMediator stateMediator) {
        super(state, stateMediator);
        super.stateMediator.setC3(this);
    }

}