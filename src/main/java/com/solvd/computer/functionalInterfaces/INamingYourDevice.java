package computer.functionalInterfaces;

@FunctionalInterface
public interface INamingYourDevice {

    String naming(String i);

    default String yourDevice(String device) {
        return "Your device  "+device;
    }
}

