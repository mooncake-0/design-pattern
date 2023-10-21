package creational.singleton;


/*
 V2 에서 쓸데없는 기다림을 pass 할 수 있으나, 이는 틀렸음
 V1 에서의 문제를 해결하지 못함
 */
public class HelloV4 {

    private static HelloV4 instance;

    private HelloV4() {
    }

    public static HelloV4 getInstance() {
        if (instance == null) {
            synchronized (HelloV4.class) {
                instance = new HelloV4();
            }
        }
        return instance;
    }
}
