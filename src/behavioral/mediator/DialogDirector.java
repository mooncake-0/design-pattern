package behavioral.mediator;


import java.util.List;

/*
 Font 제어 다이얼로그 뿐만 아니라 여러 Dialog 들을 띄울 수 있는데
 이 Dialog 들에 대한 모든 것을 담당함 - 생성, 결과 전달
 */
public abstract class DialogDirector {

    protected List<Widget> widgets;

    public DialogDirector(List<Widget> widgets) {
        this.widgets = createWidgets();
    }

    // 각 다이얼로그에 필요한 위젯들은 직접 생성한다
    protected abstract List<Widget> createWidgets();

    protected abstract void widgetChanged(Widget widget);

    public void showDialog() {
        // this.widget 들을 통해 Dialog 를 생성하고 return
        // 지금은 그냥 간단하게 보여주기만 한다
    }

}
