package Computer.Interfaces;

public interface Troubleshootingable {
    default String mainInstruction () {
        System.out.println ("When troubleshooting, follow the instructions of the device");
        return null;
    }

}
