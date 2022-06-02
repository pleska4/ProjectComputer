import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.Objects;

@XmlRootElement(name = "car")
@XmlType(propOrder = {"id", "model", "registration_number", "technical_sertificate_id"})
@JsonPropertyOrder({"id", "model", "registration_number", "technical_sertificate_id"})
public class CarPars {
    @JsonProperty
    private int id;
    @JsonProperty
    private String model;
    @JsonProperty
    private String registration_number;
    @JsonProperty
    private String technical_sertificate_id;


    @Override
    public String toString() {
        return "CarPars{" + "id=" + id + ", model='" + model +", registration_number=" + registration_number +
                ", technical_sertificate_id=" + technical_sertificate_id +'}';
    }

    public CarPars() {
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    @XmlElement
    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    @XmlElement
    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getTechnical_sertificate_id() {
        return technical_sertificate_id;
    }

    @XmlElement
    public void setTechnical_sertificate_id(String technical_sertificate_id) {
        this.technical_sertificate_id = technical_sertificate_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarPars)) return false;
        CarPars that = (CarPars) o;
        return id == that.id && Objects.equals(model, that.model) && Objects.equals(registration_number, that.registration_number) && Objects.equals(technical_sertificate_id, that.technical_sertificate_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, registration_number, technical_sertificate_id);
    }
}
