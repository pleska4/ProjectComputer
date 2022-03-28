package main;

import main.java.computer.*;
import main.java.computer.exceptions.VolumeMemoryException;
import main.java.computer.exceptions.WeigthMonoblockExeption;
import main.java.computer.interfaces.*;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws VolumeMemoryException, WeigthMonoblockExeption {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Manish");
        list.add("Pandit");
        list.add("Tanvi");
        list.add("Monika");
        list.remove();
        System.out.println("After removing the head.."+list.clone());

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

        Monoblock mono = new Monoblock(10);
        mono.monoblockComparison();

        //Use polymorphism
        Supportable sup = new Laptop("Lenovo", 5);
        sup.support();
        IPowerOn power = new Laptop("Lenovo", 46);
        power.iPowerOn();
        ScanIdable password = new Monoblock(50);
        password.scanIdable("No123");
        ScanIdable.enterPassword(); //use static method of interface

        //use final method
        Mouse myMouse = new Mouse("Logitech", "USB");
        myMouse.click();

        // use static method
        Printer.costPrinter(1520, 8560);

        Monitor myMonitor = new Monitor();
        myMonitor.isMonitorOffM();
        myMonitor.offMonitor(false);

        //use scanner. Enter memory volume
        SystemUnit mySystemUnit = new SystemUnit();
        mySystemUnit.summMemory();



    }
}