package computer;

import computer.exceptions.WeigthMonoblockExeption;
import org.apache.logging.log4j.LogManager;

import java.util.Objects;

public class Monoblock extends Computer {
    private final int weightMonoblock;
    private final int COSTMONOBLOCK = 10000; // Final variable
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();

    public Monoblock(int weightMonoblock) {
        this.weightMonoblock = weightMonoblock;
    }

    public void monoblockComparison() {
        Monoblock herMonoblok = new Monoblock(100);
        Monoblock ourMonoblok = new Monoblock(250);
        boolean otvet = ourMonoblok.toString().equals(herMonoblok.toString());
        if (!otvet) {
            try {
                throw new WeigthMonoblockExeption("Monobloks are different!");
            } catch (WeigthMonoblockExeption e) {
                e.printStackTrace();
            }
        }

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
        LOGGER.info("You interface for Network are LAN+WIFI");
    }

    @Override
    public void scanIdable(String iD) {
        System.out.println("Your ID: " + iD);

    }

    @Override
    public void support() {
        System.out.println("My support is from Tesla");

    }

    public int getWeightMonoblock() {
        return weightMonoblock;
    }

    public int getCOSTMONOBLOCK() {
        return COSTMONOBLOCK;
    }

    @Override
    public String toString() {
        return "weightMonoblock=" + weightMonoblock;
    }
}

