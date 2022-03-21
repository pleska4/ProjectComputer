import Computer.*;
import Computer.Interfaces.*;


public class Main {
    public static void main(String[] args) {


        Server myServer = new Server(100, 500, 25000);
        myServer.display(150);
        myServer.costComputer(1500);
        myServer.network("LAN 100");
        System.out.println(myServer);

        Laptop hisLaptop = new Laptop("Vasiliy", 1520);
        System.out.println(hisLaptop);
        hisLaptop.support();
        hisLaptop.scanIdable("4125=6!");
        hisLaptop.mainInstruction();
        hisLaptop.mainInstruction();

        Monoblock herMonoblok = new Monoblock(100);
        Monoblock ourMonoblok = new Monoblock(250);
        System.out.println(herMonoblok);
        System.out.println(ourMonoblok);
        boolean otvet = ourMonoblok.toString().equals(herMonoblok.toString());
        System.out.println("Her Mono = Our Mono? :" +otvet);

        //Use polymorphism
        Supportable sup = new Laptop("Lenovo", 5);
        sup.support();
        IPowerOn power = new Laptop("Lenovo", 46);
        power.iPowerOn();
        ScanIdable password = new Monoblock(50);
        password.scanIdable("No123");
        ScanIdable.enterPassword(); //use static method of interface

        //use final method
        Mouse myMouse = new Mouse("Logitech","USB");
        myMouse.click();

        // use static method
        Printer.costPrinter(1520, 8560);

    }
}