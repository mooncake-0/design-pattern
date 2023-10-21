package behavioral.observer.v1;

import java.util.ArrayList;

/*
 V1에선 직접 구현한 Subject 를 사용한다
 > 관찰의 대상으로 디자인된 친구임
 */
public class WeatherDataV1 implements Subject{

    private ArrayList<Observer> observers; // 자료구조의 형태로 observer 들을 보관한다

    /*
     현재 실제 Weather Data 들이 반영된다
     */
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherDataV1(float temp, float humidity, float pressure) {
        this.observers = new ArrayList<>();
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    // 바뀐 날씨 Data 들을 받아서 update 를 시작한다
    public void setChangedMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObservers(); // 변화를 notify 날린다
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : this.observers) {
            observer.update(temp, humidity, pressure);
        }
    }
}
