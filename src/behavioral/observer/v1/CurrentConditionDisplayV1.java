package behavioral.observer.v1;

public class CurrentConditionDisplayV1 implements Observer {

    private float temp;
    private float humidity;
    private float pressure;

    /*
     바뀌는 과정은 subject 에서 진행하고,
     전달받은 데이터를 Observer 에서는 사용만하면 된다
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        showDisplay(); // 바뀌면 Display 를 바꾼다
    }

    private void showDisplay() {
        System.out.println("Current Condition (T,H,P): (" + temp + ", " + humidity + ", " + pressure + ")");
    }
}
