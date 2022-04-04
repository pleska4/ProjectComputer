package main.java.computer.interfaces;

public interface Supportable {
    void support();

    default String mySupport() {
        System.out.println("Call me +3753366633333 for help");
        return null;
    }
}

