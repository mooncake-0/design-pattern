package behavioral.observer;

import behavioral.observer.v1.CurrentConditionDisplayV1;
import behavioral.observer.v1.Subject;
import behavioral.observer.v1.WeatherDataV1;
import behavioral.observer.v2.CurrentConditionDisplayV2;
import behavioral.observer.v2.WeatherDataV2;

public class ObserverTest {

    public static void main(String[] args) {

        // 해당 객체들은 자연스럽게 추가가 될텐데, Subject 와 Observer 의 역할체로써 선언되지는 않을 것 같다
        // 자신의 원래 역할대로 선언되는게 더 자연스러울 것 같은 느낌
        WeatherDataV1 weatherDataV1 = new WeatherDataV1(10, 10, 10);
        CurrentConditionDisplayV1 displayV1 = new CurrentConditionDisplayV1();

        weatherDataV1.registerObserver(displayV1);
        weatherDataV1.setChangedMeasurements(20, 20, 20);

        // 다른 Observer 도 추가하고 싶으면 간단하게 추가하면 된다
        System.out.println("------------------ JAVA API 사용");
        //

        WeatherDataV2 weatherDataV2 = new WeatherDataV2(10, 20, 30);
        CurrentConditionDisplayV2 displayV2 = new CurrentConditionDisplayV2(weatherDataV2);

        weatherDataV2.setChangedMeasurements(30, 40, 50); // 하면 끝
    }
}
