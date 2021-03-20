package MockTest.App.Interfases;

public interface IndexList<T> {

    Integer size();

    boolean isEmpty();

    T get(Integer index) throws IndexOutOfBoundsException;

    T remove(Integer index) throws IndexOutOfBoundsException;

    T set(Integer index, T node) throws IndexOutOfBoundsException;

    T add(Integer index, T node) throws IndexOutOfBoundsException;

    T add(T node) throws IndexOutOfBoundsException;

    Integer removeAll(T node);

    void removeAll();

}
