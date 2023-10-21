package behavioral.mediator;

import java.util.List;


/*
 DialogDirector 도 생성 시점에 생성 후 종료된다고 가정
 -> 필요 위젯들을 그 때 생성해서 받아둔다
 */
public class FontDialogDirector extends DialogDirector {

    public FontDialogDirector(List<Widget> widgets) {
        super(widgets);
    }

    // FontDialog 에 필요한 widget 들은 직접 생성해야 한다
    @Override
    public List<Widget> createWidgets() {

        // ListBox 와 같은 필요한 Widget 들을 직접 생성한다
        ListBox listBox = new ListBox(this);
        super.widgets.add(listBox);

        // .. 더 생성 후 담는다

        return super.widgets;
    }


    /*
     Widget 으로 부터 발생한 trigger 에 대해
     다른 Widget 에게 상태를 전달하여
     다른 Action 발생을 유도한다 >> Callback 의 종류인데, 그것을 한 곳에서 관리하는 것
     (Dialog, Widget 들이 많아지면 차라리 Callback Interface 를 만들어서 Strategy 로 가는게 나을 수도)
     */
    @Override
    public void widgetChanged(Widget widget) {

        if (widget instanceof ListBox) {
            ListBox lb = (ListBox) widget;
            String curSelection = lb.getSelection();

            // widgets 내에서 데이터를 전송하고자 하는 Widget 을 찾는다
            for (Widget w : widgets) {
                if (w instanceof EntryField) {
                    EntryField ef = (EntryField) w;
                    ef.setText(curSelection);
                }
            }

        }

        /*
         NAIVE 하게 구현해본 것..
         분기가 들어가니 더 심화된 디자이닝 필요함
         */
        // ...

    }
}
