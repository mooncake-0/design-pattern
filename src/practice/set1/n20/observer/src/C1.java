package practice.set1.n20.observer.src;

import java.util.ArrayList;
import java.util.List;

public class C1 extends C implements Observer, Subject{

    private List<Observer> observers;

    public C1(String state) {
        super(state);
        this.observers = new ArrayList<>();
    }

    @Override
    public void update(Subject subject) {
        // Observer 로써, 등록된 Subject 가 바뀌면 호출되어 나의 state 값도 바꾼다
        // NOTIFY 받은 것
        if (subject instanceof C3) {
            C3 c3 = (C3) subject;
            this.setState(c3.getState());
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {// 나의 값이 바뀌었을 때 호출한다
        for (Observer observer : observers) {
            observer.update(this); // 나를 던진다
        }
    }

    @Override
    public void setState(String state) {
        super.setState(state);
        notifyAllObservers();
    }
}
