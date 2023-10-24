package practice.set1.n20.observer.src;

import java.util.ArrayList;
import java.util.List;

// C1 -> C2 변경 전달
// C3 -> C1 -> 결과적으로 C2 변경 전달
public abstract class C {

    protected String state;

    public C(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
