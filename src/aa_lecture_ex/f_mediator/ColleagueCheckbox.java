package aa_lecture_ex.f_mediator;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {  
// ������
        super(caption, group, state);
    }
    public void setMediator(Mediator mediator) {           // Mediator�� ����
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {    // Mediator���� ��ȿ/��ȿ�� ����
        setEnabled(enabled);
    }
    public void itemStateChanged(ItemEvent e) {           // ���°� �ٲ�� Mediator���� ����
        mediator.colleagueChanged();
    }
}
