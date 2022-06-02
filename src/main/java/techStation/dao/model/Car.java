package techStation.model;

public class Car extends techStation.model.AbstractEntity {
    private String model;
    private String registration_number;
    private String technical_sertificate_id;

    public Car(String model, String registration_number, String technical_sertificate_id) {
        this.model = model;
        this.registration_number = registration_number;
        this.technical_sertificate_id = technical_sertificate_id;
    }

    public Car() {

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getTechnical_sertificate_id() {
        return technical_sertificate_id;
    }

    public void setTechnical_sertificate_id(String technical_sertificate_id) {
        this.technical_sertificate_id = technical_sertificate_id;
    }
}




