package creational.singleton;

/*
 충분해보이지만, 아주 드물게 Thread 가 Cache 메모리에서 로딩함으로써
 sync 문제 발생 가능성
 */
public class HelloV5 {

    private static HelloV5 instance;

    private HelloV5() {
    }

    public static HelloV5 getInstance() {
        if (instance == null) {
            synchronized (HelloV5.class) {
                if (instance == null) {
                    instance = new HelloV5();
                }
            }
        }
        return instance;
    }
}
