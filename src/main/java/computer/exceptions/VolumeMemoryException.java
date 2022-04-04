package computer.exceptions;

public class VolumeMemoryException extends Exception{
    public VolumeMemoryException() {
    }

    public VolumeMemoryException(String message) {
        super(message);
    }

    public VolumeMemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public VolumeMemoryException(Throwable cause) {
        super(cause);
    }

    public VolumeMemoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
