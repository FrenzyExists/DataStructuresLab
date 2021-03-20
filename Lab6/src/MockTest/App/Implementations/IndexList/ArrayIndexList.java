package MockTest.App.Implementations.IndexList;

import MockTest.App.Interfases.IndexList;

public class ArrayIndexList<T> implements IndexList<T> {
    @Override
    public Integer size() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get(Integer index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T remove(Integer index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T set(Integer index, Object node) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T add(Integer index, Object node) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T add(Object node) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Integer removeAll(Object node) {
        return null;
    }

    @Override
    public void removeAll() {

    }

    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public T[] cloneList() throws CloneNotSupportedException {
        return null;
    }
}
