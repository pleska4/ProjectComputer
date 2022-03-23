package main.java.computer.exceptions;

public class CostPrinterException extends Exception{
    public CostPrinterException() {
    }

    public CostPrinterException(String message) {
        super(message);
    }

    public CostPrinterException(String message, Throwable cause) {
        super(message, cause);
    }

    public CostPrinterException(Throwable cause) {
        super(cause);
    }

    public CostPrinterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
