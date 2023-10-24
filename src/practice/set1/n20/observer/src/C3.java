package practice.set1.n20.observer.src;

import java.util.ArrayList;
import java.util.List;

public class C3 extends C implements Subject{

    private List<Observer> observers;

    public C3(String state) {
        super(state);
        this.observers = new ArrayList<>();
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