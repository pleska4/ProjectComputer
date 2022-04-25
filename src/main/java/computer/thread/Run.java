package computer.thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Run implements Runnable{
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void run() {
        for (int i=1; i<5; i++)
            LOGGER.info("Application is using " + i + " people!");


    }
}
