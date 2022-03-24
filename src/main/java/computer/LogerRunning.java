package main.java.computer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogerRunning {

    private static final Logger LOGGER = LogManager.getLogger(LogerRunning.class);
    public static void main(String[] args) {
        LOGGER.info("LOGGER INFO");
        LOGGER.debug("LOGGER DEBUG");
        LOGGER.error("LOGGER ERROR");


    }


    }