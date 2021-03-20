package MockTest.App.Interfases;

public interface IndexList<T> {

    /**
     *
     * @return
     */
    Integer size();

    /**
     *
     * @return
     */
    boolean isEmpty();

    /**
     *
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    T get(Integer index) throws IndexOutOfBoundsException;

    /**
     *
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    T remove(Integer index) throws IndexOutOfBoundsException;

    /**
     *
     * @param index
     * @param node
     * @return
     * @throws IndexOutOfBoundsException
     */
    T set(Integer index, T node) throws IndexOutOfBoundsException;

    /**
     *
     * @param index
     * @param node
     * @return
     * @throws IndexOutOfBoundsException
     */
    T add(Integer index, T node) throws IndexOutOfBoundsException;

    /**
     *
     * @param node
     * @return
     * @throws IndexOutOfBoundsException
     */
    T add(T node) throws IndexOutOfBoundsException;

    /**
     *
     * @param node
     * @return
     */
    Integer removeAll(T node);

    /**
     *
     */
    void removeAll();

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public T[] cloneList() throws CloneNotSupportedException;

}

