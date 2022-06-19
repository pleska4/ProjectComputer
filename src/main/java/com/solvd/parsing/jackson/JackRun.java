package parsing.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parsing.model.CarPars;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JackRun {
    private static final Logger LOGGER = LogManager.getLogger(JackRun.class);
    private static File file = new File(System.getProperty("user.dir") + "/src/main/resources/jacks.json");

    public static void serialize(CarPars carPars) {
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        try {
            List<CarPars> carParses = new ArrayList<>();
            carParses.add(carPars);
            objectMapper.writeValue(file, carParses);
            LOGGER.info("Serialization succesfull to: " + file.getPath());
        } catch (JsonProcessingException e) {
            LOGGER.info("JsonProcessingException", e);
        } catch (IOException e) {
            LOGGER.info(e);
        }
    }

    public static void deserialize() {
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class, CarPars.class);
        try {
            List<CarPars> serviceStations = objectMapper.readValue(file, type);
            LOGGER.info("Successfully deserialized from: " + file.getPath());
            LOGGER.info(serviceStations);
        } catch (IOException e) {
            LOGGER.info("Error!!!", e);
        }
    }

}