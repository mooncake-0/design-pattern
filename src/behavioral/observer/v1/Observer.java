package behavioral.observer.v1;

/*
 Observer 는 action 에 대한 update 를 진행해줘야 한다
 > 현재 예시를 기준으로 생각한다
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
