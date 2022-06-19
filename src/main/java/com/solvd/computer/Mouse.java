package com.solvd.computer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mouse {
    private static final Logger LOGGER = LogManager.getLogger(Mouse.class);

    private String mouseModel;
    private String interfaceMouse;


    public Mouse() {    }
    public Mouse(String mouseModel) {
        this.mouseModel = mouseModel;
    }
    public Mouse(String mouseModel, String interfaceMouse) {
        this.mouseModel = mouseModel;
        this.interfaceMouse = interfaceMouse;
    }
    @Override
    public String toString() {
        return mouseModel+ '\'';
    }
    public void setMouseModel(String modelMouse) {
        this.mouseModel = modelMouse;
    }
    public void setInterfaceMouse(String interfaceMouse) {
        this.interfaceMouse = interfaceMouse;
    }
    public String getMouseModel() {
        return mouseModel;
    }
    public String getInterfaceMouse() {
        return interfaceMouse;
        }
    public final void click() {
        LOGGER.info("Interface of Mouse: " + interfaceMouse);
        LOGGER.info("Unknown interface");
    }
}




