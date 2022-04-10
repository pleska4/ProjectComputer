package computer.functionalInterfaces;

@FunctionalInterface
public interface INamingYourDevice {
    String getting(String name);

    default String yourDevice(String device) {
        return "Your device"+device;
    }
}