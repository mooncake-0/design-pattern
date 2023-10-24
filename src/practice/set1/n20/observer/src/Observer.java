package practice.set1.n20.observer.src;

// Java Library 는 abstract class 기 때문에 Observer Interface 를 직접 만든다
public interface Observer {

    void update(Subject subject); // 라이브러리와 동일한 형태로 객체 자체를 던져주자
}
