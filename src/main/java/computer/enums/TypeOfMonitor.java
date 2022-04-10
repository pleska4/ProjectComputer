package computer.enums;

public enum TypeOfMonitor {
    OLED("OLED"),
    VA("VA"),
    IPS("IPS"),
    TFTTN("TFTTN"),
    QLED("QLED");
    private String value;
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
                System.out.println("Your monitor supprt company Zayka");
                break;
            case VA:
                System.out.println("Your monitor supprt company SW");
                break;
            case IPS:
                System.out.println("Your monitor may be remove only!");
                break;
            case TFTTN:
                System.out.println("Your monitor is bad, remove it !");
                break;
            case QLED:
                System.out.println("Your monitor supprt company DASS");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeOfMonitor);
        }
    }
    public TypeOfMonitor getTypeOfMonitor() {
        return typeOfMonitor;
    }

    public void setTypeOfMonitor(TypeOfMonitor typeOfMonitor) {
        this.typeOfMonitor = typeOfMonitor;
    }


}
