package computer.enums;

public enum TypeLaptop {
    HP("HP"),
    FUJITSU("FIJITSU"),
    LENOVO("LENOVO"),
    DELL("DELL");
    private String value;
    TypeLaptop (String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
