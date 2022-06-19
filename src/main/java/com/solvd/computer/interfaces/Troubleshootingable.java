package com.solvd.computer.interfaces;

import org.apache.logging.log4j.LogManager;

public interface Troubleshootingable {
    org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();

    default String mainInstruction () {
                LOGGER.info("When troubleshooting, follow the instructions of the device");
        return null;
    }

}
