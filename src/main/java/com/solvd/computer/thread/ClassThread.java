package com.solvd.computer.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassThread extends Thread {
    private static final Logger LOGGER = LogManager.getLogger();
    public void summUsers(int a) {
        for (int i=1; i<a; i++)
            LOGGER.info("Users of site = " + i);
    }


}
