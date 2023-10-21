package creational.singleton;


/*
 V1: 멀티 쓰레드 환경에서 싱글톤 보장이 어렵다
 */
public class HelloV1 {

    private static HelloV1 instance;

    private HelloV1() {} // private 을 통한 외부 생성 제어


    public static HelloV1 getInstance() {
        if (instance == null) {
            instance = new HelloV1();
        }
        return instance;
    }
}
