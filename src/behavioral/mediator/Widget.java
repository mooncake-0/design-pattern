package behavioral.mediator;


/*
 다이얼로그 내부에 있는 각각의 속성을 제어하기 위해 적용된 UI
 */
public abstract class Widget {

    // 해당 위젯이 변경될 시, 같은 다이얼로그안에 있는 다른 위젯에게 말해줘야 할 수도 있다
    // 이 때, 자신을 탄생시킨 Director 를 Atrribute 로 가지고 있는다
    // 자신을 탄생시키는 구조이므로 Dialog Director 는 주입받는게 맞아보인다

    private DialogDirector dialogDirector;

    public Widget(DialogDirector dialogDirector) {

        this.dialogDirector = dialogDirector;

    }

    // 상태 변화 감지시 호출되는 callback method
    // 상태 변화 되는 부분에서 호출하게 될 것이다
    public void changed() {
        // 특정 상태가 변경된거에 대하여 change 를 전달한다
        dialogDirector.widgetChanged(this);
    }
}
