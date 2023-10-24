package practice.set1.n20.observer.src;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
