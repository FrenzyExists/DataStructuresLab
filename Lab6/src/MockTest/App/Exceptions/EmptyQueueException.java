package MockTest.App.Exceptions;

@SuppressWarnings("serial")
public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(String message) {
        super(message);
    }
}
