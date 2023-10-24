package practice.set1.n20.mediator.src;

import java.util.ArrayList;
import java.util.List;

public class CStateMediator extends StateMediator {


    // 강의 예제는 그 Director 가 생성까지 감독하는 거였던 거고,
    // 내가 보기엔 여기서 제어한다는게 그냥 중요한 것인듯
    // List 로 알고 있나 각자 알고있나는 상관없는 듯?


    // 여기서 이렇게 된다는건 중재할 애들을 다 알고 있다는 뜻
    @Override
    public void onStateChanged(C c) {
        if (c instanceof C1) { // C2 를 변경한다
            super.c2.setState(c.getState());
        } else if (c instanceof C3) { // C3 를 변경한다
            super.c1.setState(c.getState());
        }
    }


}
