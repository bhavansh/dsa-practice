package datastructures.queues;

public interface Queue<E> {

    void enqueue(E e);
    E dequeue();
    E front();
    boolean isEmpty();
    int size();
    void print();


}
