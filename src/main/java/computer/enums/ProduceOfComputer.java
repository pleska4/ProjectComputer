package computer.enums;

public enum ProduceOfComputer {
       XIAOMI("Xiaomi"), HUAWEI("Huawei"), LG("LG"),  SAMSUNG("Samsung");

    private String value;

        ProduceOfComputer(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }