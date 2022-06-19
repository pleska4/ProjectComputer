package computer.enums;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public enum TypeOfMonitor {
    OLED("OLED"),
    VA("VA"),
    IPS("IPS"),
    TFTTN("TFTTN"),
    QLED("QLED");
    private String value;
    private static final Logger LOGGER = LogManager.getLogger();
    private TypeOfMonitor typeOfMonitor;
    TypeOfMonitor(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
    public void supportMonitor( TypeOfMonitor typeOfMonitor) {
        switch (typeOfMonitor) {
            case OLED:
                LOGGER.info("Your monitor support company Zayka");
                break;
            case VA:
                LOGGER.info("Your monitor supprt company SW");
                break;
            case IPS:
                LOGGER.info("Your monitor may be remove only!");
                break;
            case TFTTN:
                LOGGER.info("Your monitor is bad, remove it !");
                break;
            case QLED:
                LOGGER.info("Your monitor supprt company DASS");
                break;
            default:
                throw new IllegalStateException("Your type of Monitor is not support: " + typeOfMonitor);
        }
    }
    public TypeOfMonitor getTypeOfMonitor() {
        return typeOfMonitor;
    }

    public void setTypeOfMonitor(TypeOfMonitor typeOfMonitor) {
        this.typeOfMonitor = typeOfMonitor;
    }


}
