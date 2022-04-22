package computer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Server extends Computer {
    private static final Logger LOGGER = LogManager.getLogger();
    private int numberOfConnections;
    private int size;
    private int cost;

    public Server(int numberOfConnections, int size, int cost) {
        this.numberOfConnections = numberOfConnections;

    }

    @Override
    public void display(int size) {
        LOGGER.info("Size display of Server: " + size + " inches");
    }

    @Override
    public void network(String interfaceNetwork) {
        LOGGER.info("Server connected to the network " + interfaceNetwork);

    }

    @Override
    public void costComputer(int cost) {

        LOGGER.info("Class cost of Server is budget class and cost " + cost);
    }

    @Override
    public String toString() {
        return "Server1C " + "  Size display of Server: " + this.size + " inches.  "
                + "  Class cost of Server is budget class and cost " + this.cost
                + "  Number of connections: " + numberOfConnections;
    }

    @Override
    public boolean equals(Object srver) {
        if (this == srver) return true;
        if (!(srver instanceof Server)) return false;
        Server server = (Server) srver;
        return numberOfConnections == server.numberOfConnections && size == server.size && cost == server.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfConnections, size, cost);
    }

    @Override
    public void iPowerOn() {
        LOGGER.info("Server's Power - ON");

    }
    @Override
    public void switchNetwork() {
        LOGGER.info("You interface for Network is LAN");
    }
    @Override
    public void scanIdable(String iD) {
        LOGGER.info("Your ID: " + iD);
    }

    @Override
    public void support() {
        LOGGER.info("My support from CISCO");
    }

    @Override
    public String mySupport() {
        return super.mySupport();
    }

    @Override
    public double add(double volume) {
        return 0;
    }

    @Override
    public String calculateUsers() {
        return null;
    }


    @Override
    public void gettingName() {

    }

    @Override
    public String naming(String i) {
        return null;
    }

    @Override
    public String yourDevice(String device) {
        return super.yourDevice(device);
    }

    @Override
    public int add(int volume) {
        return 0;
    }

    @Override
    public String calculateUsers(int colNames) {
        return null;
    }

    @Override
    public String mainInstruction() {
        return super.mainInstruction();
    }

    @Override
    public int iCalculateUsers(int colNames) {
        return 0;
    }

    @Override
    public String usersOfDevice(int users) {
        return super.usersOfDevice(users);
    }
}



