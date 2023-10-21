package creational.singleton;

/*
 V2: synchronize 사용하면 V1 의 문제는 해결할 수 있다
 - 하지만 쓸데 없이 기다리는 성능 issue 존재
 */
public class HelloV2 {

    private static HelloV2 instance;

    private HelloV2() {}

    // synchronized = critical-section화
    // 한 thread 가 접근시 탈출전까지 타 thread 가 접근할 수 없다
    public static synchronized HelloV2 getInstance() {
        if (instance == null) {
            instance = new HelloV2();
        }
        return instance;
    }
}
