package main.java.computer.exceptions;

public class WeigthMonoblockExeption extends Exception{
    public WeigthMonoblockExeption() {
    }

    public WeigthMonoblockExeption(String message) {
        super(message);
    }

    public WeigthMonoblockExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public WeigthMonoblockExeption(Throwable cause) {
        super(cause);
    }

    public WeigthMonoblockExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
