package creational.singleton;

/*
 V3: 충분히 해결 but 메모리를 미리 잡아먹는다
 -> 하지만 필요하니까 있을 것이기 때문에 이와 같은 방식도 많이 사용
 */
public class HelloV3 {

    private static HelloV3 instance = new HelloV3();

    private HelloV3() {}

    public static HelloV3 getInstance() {
        return instance;
    }
}