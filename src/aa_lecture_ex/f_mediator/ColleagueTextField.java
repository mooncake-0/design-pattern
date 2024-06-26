package aa_lecture_ex.f_mediator;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns) {   // ������
        super(text, columns);
    }
    public void setMediator(Mediator mediator) {         // Mediator�� ����
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {   // Mediator���� ��ȿ/��ȿ�� ����
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    public void textValueChanged(TextEvent e) {          // ���ڿ��� ���ϸ� Mediator���� ����
        mediator.colleagueChanged();
    }
}
