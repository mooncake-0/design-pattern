package behavioral.mediator;


public class ListBox extends Widget{

    private String curSelection;

    public ListBox(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public String getSelection() {
        return this.curSelection;
    }

    /*
     각 ListBox 의 Item 에는 onClick() 과 같은 callback 함수가 지정,
     다음과 같은 형태를 띈다

     void onClick(){
         this.curSelection = CUR_SELECTED_STRING;
         super.widgetChanged();
     }
     */
}