package computer.exceptions;

public class InterfaceMouseException extends Exception{
    public InterfaceMouseException() {
    }

    public InterfaceMouseException(String message) {
        super(message);
    }

    public InterfaceMouseException(String message, Throwable cause) {
        super(message, cause);
    }

    public InterfaceMouseException(Throwable cause) {
        super(cause);
    }

    public InterfaceMouseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
