package com.solvd.computer.interfaces;

import org.apache.logging.log4j.LogManager;

public interface ScanIdable {
    org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
    void scanIdable (String iD);

    static void enterPassword() {

        LOGGER.info("Enter your password!");
    }

}
