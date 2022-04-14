package computer;

import computer.functionalInterfaces.IAddVolumeHDD;
import computer.functionalInterfaces.ICalculateUsers;
import computer.functionalInterfaces.INamingYourDevice;
import computer.interfaces.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class Computer implements Troubleshootingable, ScanIdable, ISwitchNetwork, IPowerOn, Supportable, ICalculateUsers, INamingYourDevice, IAddVolumeHDD {
    private static String nameComputer; //use static variable
    private String ipComputer;
    private String osComputer;
    private Mouse mouse;
    private Printer printer;
    private SystemUnit systemUnit;
    private EMail eMail;
    private Monitor monitor;
    private static final Logger LOGGER = LogManager.getLogger();




    // add static block
    static {
        System.out.println("You bought the best device in the world!");
    }

    public Computer() {
        this.ipComputer = "fromDHCP";
        this.osComputer = "linux";
    }

    public Computer(String nameComputer, String ipComputer, String osComputer, Mouse mouse) {
        Computer.nameComputer = nameComputer;
        this.osComputer = osComputer;
        this.ipComputer = ipComputer;
        this.mouse = mouse;
    }

    public Computer(String nameComputer) {
        Computer.nameComputer = nameComputer;

    }


    public void setNameComputer(String nameComputer) {
        this.nameComputer = nameComputer;
    }

    public void setOsComputer(String osComputer) {
        this.osComputer = osComputer;
    }

    public void setIpComputer(String ipComputer) {
        this.ipComputer = ipComputer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }

    public void setMail(EMail eMail) {
        this.eMail = eMail;
    }

    public void setMonitorl(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public String getNameComputer() {
        return nameComputer;
    }

    public String getOsComputer() {
        return osComputer;
    }

    public String getIpComputer() {
        return ipComputer;
    }

    public Printer getPrinter() {
        return printer;
    }

    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    public EMail getMail() {
        return eMail;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void showComputerInfo() {
        LOGGER.info("Name Computer  : " + nameComputer + "\n" + "OS Computer: " + osComputer + "\n" + "IP Computer " + ipComputer);
    }

    public void sendLetterForJack(String addressEmailAuthor, String addressEmailRecipient) {

        EMail newLetter = new EMail("For Jack", "I love you", "Your wife Mary");
        LOGGER.info("AddressAuthor: " + addressEmailAuthor + newLetter.letterText() + "\n" + "AddressRecipient: " + addressEmailRecipient);
    }


    public void sendLetter(String addressEmailAuthor, String addressEmailRecipient, EMail eMail) {
        LOGGER.info("Author of letter: " + eMail.getSignatureLetter());
        LOGGER.info("AddressAuthor: " + addressEmailAuthor + "\n" + "AddressRecipient: " + addressEmailRecipient);
    }

    public abstract void display(int size);

    public abstract void network(String interfaceNetwork);

    public abstract void costComputer(int cost);


    public abstract double add(double volume);
}




