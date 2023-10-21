package creational.singleton;

/*
 V6 : Volatile 을 추가함으로써 항상 메인메모리에서 읽어옴으로써
 Thread 들 간 sync 를 맞춰준다
 -> Multi 스레드 환경에서 온전한 싱글톤 패턴의 완성
 */
public class HelloV6 {

    private volatile static HelloV6 instance = null;

    private HelloV6() {
    }

    public static HelloV6 getInstance() {
        if (instance == null) {
            synchronized (HelloV6.class) {
                if (instance == null) {
                    instance = new HelloV6();
                }
            }
        }
        return instance;
    }
}
