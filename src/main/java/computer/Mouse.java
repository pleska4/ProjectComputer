package main.java.computer;

public class Mouse {
    private String mouseModel;
    private String interfaceMouse;


    public Mouse() {
    }

    public Mouse(String mouseModel) {
        this.mouseModel = mouseModel;
    }

    public Mouse(String mouseModel, String interfaceMouse) {
        this.mouseModel = mouseModel;
        this.interfaceMouse = interfaceMouse;
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
        System.out.println("Interface of Mouse: " + interfaceMouse);
        System.out.println("Unknown interface");
    }
}




