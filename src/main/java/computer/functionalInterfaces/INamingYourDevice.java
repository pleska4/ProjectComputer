package computer.functionalInterfaces;

@FunctionalInterface
public interface INamingYourDevice {

    void gettingName();


    default String yourDevice(String device) {
        return "Your device"+device;
    }
}