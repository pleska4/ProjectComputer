package com.solvd.computer.interfaces;
import org.apache.logging.log4j.LogManager;

public interface Supportable {
    org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
    void support();

    default String mySupport() {
        LOGGER.info("Call me +3753366633333 for help");
        return null;
    }
}

