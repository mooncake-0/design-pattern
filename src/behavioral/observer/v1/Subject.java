package behavioral.observer.v1;

/*
 관찰의 대상이되는 Publisher 이다
 Publisher 는 자신한테 등록된 Observer 들을 직접 제어할 수 있다
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
