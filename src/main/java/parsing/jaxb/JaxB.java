package parsing.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parsing.model.CarPars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JaxB {
    private static final Logger LOGGER = LogManager.getLogger(JaxB.class);

    public static void marshal(CarPars carPars) {
        try {
            JAXBContext context = JAXBContext.newInstance(CarPars.class);
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            mar.marshal(carPars, new File(System.getProperty("user.dir") + "/src/main/resources/ExampleJaxb.xml"));
        } catch (JAXBException e){
            LOGGER.info(e);
        }
    }
    public static CarPars unmarhall() throws FileNotFoundException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(CarPars.class);
        return (CarPars) context.createUnmarshaller()
                .unmarshal(new FileReader(System.getProperty("user.dir") + "/src/main/resources/ExampleJaxb.xml"));
    }


}