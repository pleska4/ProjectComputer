package computer;

import java.util.Objects;

public class Laptop extends Computer {
    String nameUserLaptop;
    int size;

    public Laptop(String nameUserLaptop, int size) {
        this.nameUserLaptop = nameUserLaptop;
        this.size = size;
    }

    @Override
    public void display(int size) {
        System.out.println("Size display of Laptop: " + size + " inches");
    }

    @Override
    public void network(String interfaceNetwork) {
        System.out.println("Laptop connected to the network " + interfaceNetwork);
    }

    @Override
    public void costComputer(int cost) {
        System.out.println("Class cost of Laptop is medium class " + cost);
    }

    @Override
    public boolean equals(Object lap) {
        if (this == lap) return true;
        if (!(lap instanceof Laptop)) return false;
        Laptop laptop = (Laptop) lap;
        return size == laptop.size && nameUserLaptop.equals(laptop.nameUserLaptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameUserLaptop, size);
    }


    @Override
    public void iPowerOn() {
        System.out.println("Laptop Power - OFF");

    }

    @Override
    public void switchNetwork() {
        System.out.println("You interface for Network is WiFi");

    }

    @Override
    public void scanIdable(String iD) {
        System.out.println("Your ID: " + iD);

    }

    @Override
    public void support() {
        System.out.println("My support is from Samsung");

    }
}

