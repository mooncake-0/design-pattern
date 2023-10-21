package behavioral.observer.v2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplayV2 implements Observer {

    // 등록은 외부에서 해줘도 되고, 내가 원하는대로 해주면 된다
    private Observable observable;

    // display 수치들
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplayV2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    // Java 에서는 뭘 전달해야할지 모르기 때문에 알아서 하라고 객체 그 자체를 전달한다
    @Override
    public void update(Observable o, Object arg) { // update notify 가 발생하면 호출된다

        if (o instanceof WeatherDataV2) { // 내가 원하는 로직인지 체크
            WeatherDataV2 wd = (WeatherDataV2) o; // 바뀐 데이터를 가져올 수 있다
            this.temp = wd.getTemp();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            showDisplay();
        }

        // 이와 같은 방식을 통해 1 개 이상의 Observable (Subject) 를 등록할 수 있다
        // 알맞은 Observable 들만 field 내에서 잘 관리해주면 된다
    }

    private void showDisplay() {
        System.out.println("Current Condition (T,H,P): (" + temp + ", " + humidity + ", " + pressure + ")");
    }

}
