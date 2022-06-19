package computer.exceptions;

public class WeigthMonoblockException extends Exception{
    public WeigthMonoblockException() {
    }

    public WeigthMonoblockException(String message) {
        super(message);
    }

    public WeigthMonoblockException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeigthMonoblockException(Throwable cause) {
        super(cause);
    }

    public WeigthMonoblockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
