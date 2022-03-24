package main.java.computer.exceptions;

public class SupportException extends Exception{
    public SupportException() {
    }

    public SupportException(String message) {
        super(message);
    }

    public SupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public SupportException(Throwable cause) {
        super(cause);
    }

    public SupportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
