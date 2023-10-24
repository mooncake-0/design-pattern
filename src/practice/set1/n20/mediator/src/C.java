package practice.set1.n20.mediator.src;

// C1 -> C2 변경 전달
// C3 -> C1 -> 결과적으로 C2 변경 전달
public abstract class C {

    protected StateMediator stateMediator;
    protected String state;

    public C(String state, StateMediator stateMediator){
        this.state = state;
        this.stateMediator = stateMediator;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.stateMediator.onStateChanged(this);
    }
}
