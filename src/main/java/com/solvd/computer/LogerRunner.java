import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class LogerRunner {
    private static final Logger LOGGER = LogManager.getLogger(LogerRunner.class);
    public static void main(String[] args){
        LOGGER.info("LOGGER INFO");
        LOGGER.debug("LOGGER DEBUG");
        LOGGER.error("LOGGER ERROR");
    }
}
