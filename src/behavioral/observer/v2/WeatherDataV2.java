package behavioral.observer.v2;

import java.util.Observable;

/*
 V2 : Java 에서 제공하는 Subject (Observable) 을 사용한다
 > Observable abstract class 에 이미 Observer 보관소가 구현되어 있기 때문에,
 > add, remove, notify 등을 사용하기만 하면 된다
 > 다만, Observable 에게 자명하게 update 가 필요한 상황임을 전달하기 위해, Observable 에서 사용하는 boolean changed 값을 제어해줘야 한다
 */
public class WeatherDataV2 extends Observable {

    // Observer 보관소는 Observable 에 구현되어 있다
    private float temp;
    private float humidity;
    private float pressure;

    // 바뀐 날씨 Data 들을 받아서 update 를 시작한다
    public void setChangedMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChangeCallback(); // 변화를 notify 날린다
    }

    private void measurementChangeCallback() {
        super.setChanged(); // Observable 의 boolean attribute 를 변경하여 notify 상황임을 체크해둔다 (안해주면 notfiy 안함)
        super.notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
