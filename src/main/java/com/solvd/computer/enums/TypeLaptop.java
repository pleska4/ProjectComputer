package computer.enums;

public enum TypeLaptop {
    HP {
        public String getValue(){
            return "HP";
        }
    },
    FUJITSU{
        public String getValue(){
        return "FUJITSU";
    }

    },
    LENOVO{
        public String getValue(){
            return "HP";
        }
    },
    DELL{
        public String getValue(){
            return "HP";
        }
    };
    private String value;
    TypeLaptop (String value){
        this.value = value;
    }

    TypeLaptop() {
        this.value = String.valueOf(valueOf("HP"));
    }

    public String getValue(){
        return value;
    }
}
