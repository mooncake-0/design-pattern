package practice.set2.n18_sync.src;

/*
 뭔지 모르겠어서 순회해보니 데코레이터 패턴 같음
 synchronize 기능으로 한계층 덮은 것
 */

public class SynchronizedIteratorTemplate implements Iterator {

    private Iterator iterator;

    public SynchronizedIteratorTemplate(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public synchronized boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Object next() {
        return this.iterator.next();
    }

    @Override
    public void remove() {
        this.iterator.remove();
    }
}
