package computer.enums;

public enum NameOfBrand {

    BRAND {
        public String getValue() {
            return "Brand";
        }
    };
    private String value;

    public String getValue() {
        return value;
    }

}