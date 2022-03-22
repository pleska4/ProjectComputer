package computer;

import java.util.Objects;

public class Monoblock extends Computer {
    private int weightMonoblock;
    private final int COSTMONOBLOCK = 10000; // Final variable

    public Monoblock(int weightMonoblock) {
        this.weightMonoblock = weightMonoblock;
    }

    @Override
    public void display(int size) {
        System.out.println("Size display of Monoblock: " + size + " inches");
    }

    @Override
    public void network(String interfaceNetwork) {
        System.out.println("Monoblock connected to the network " + interfaceNetwork);
    }

    @Override
    public void costComputer(int cost) {
        System.out.println("Class cost of Monoblock is premium class and cost " + cost);
    }

    public String toString() {
        return "Massa monobloka: " + weightMonoblock + "Cena monobloka: " + COSTMONOBLOCK;

    }

    @Override
    public boolean equals(Object mono) {
        if (this == mono) return true;
        if (!(mono instanceof Monoblock)) return false;
        Monoblock monoblock = (Monoblock) mono;
        return weightMonoblock == monoblock.weightMonoblock && COSTMONOBLOCK == monoblock.COSTMONOBLOCK;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightMonoblock, COSTMONOBLOCK);
    }

    @Override
    public void iPowerOn() {
        System.out.println("Monobloks Power - ON");

    }

    @Override
    public void switchNetwork() {
        System.out.println("You interface for Network are LAN+WIFI");
    }

    @Override
    public void scanIdable(String iD) {
        System.out.println("Your ID: " + iD);
    }

    @Override
    public void support() {
        System.out.println("My support is from Tesla");

    }
}

