package MockTest.App;

public interface Queue<T> {

    // Get size of Queue
    int size();

    void enqueue();

    T dequeue();

    T element();

    boolean offer(T node);

    T peek();
}
