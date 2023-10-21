package behavioral.mediator;

public class EntryField extends Widget{

    private String text;

    public EntryField(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void setText(String text) {
        this.text = text;
    }

}
