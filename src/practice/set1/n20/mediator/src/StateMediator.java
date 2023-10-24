package practice.set1.n20.mediator.src;


import practice.set1.n20.mediator.src.C;

import java.util.ArrayList;
import java.util.List;

/*
 C 의 상태들 변경을 듣는다
 Mediator 는 자신이 담당하는 Class 가 Dependency 로 가지고 있게 된다.
 그 Class 가 상태 변경이 발생할 때마다 직접 Mediator 를 호출해서 (Shared Aggregate 하고 있기 대문) Mediator 구현체에게 전달한다
 */
public abstract class StateMediator {

    // Mediator 는 참여하는 모든 객체를 알고 있어야 한다
    protected C1 c1;
    protected C2 c2;
    protected C3 c3;

    public abstract void onStateChanged(C c);

    public void setC1(C1 c1) {
        this.c1 = c1;
    }

    public void setC2(C2 c2) {
        this.c2 = c2;
    }

    public void setC3(C3 c3) {
        this.c3 = c3;
    }
}
