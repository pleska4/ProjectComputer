package computer.enums;

public enum TypeOfPrinter {
    LASER("LASER"),
    MATRIX("MATRIX"),
    JET("JET");

    private String value;

    TypeOfPrinter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}



