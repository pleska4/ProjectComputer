import computer.*;
import computer.enums.TypeLaptop;
import computer.exceptions.VolumeMemoryException;
import computer.exceptions.WeigthMonoblockExeption;
import computer.interfaces.*;
import computer.myLinkedList.MyLinkedList;
import java.util.*;
import java.util.LinkedList;
import java.util.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static computer.enums.TypeLaptop.*;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws VolumeMemoryException, WeigthMonoblockExeption {

        TypeLaptop laptop = DELL;
        switch (laptop) {
            case DELL:
                System.out.println("Your laptop type is DELL!");
                break;
            case HP:
                System.out.println("Your laptop type is HP!");
                break;
            case FUJITSU:
                System.out.println("Your laptop type is Fujitsu!");
                break;
            case LENOVO:
                System.out.println("Your laptop type is Lenovo!");
                break;
        }


        //add LinkedList
        LinkedList<String> list = new LinkedList<String>();
        list.add("Pentium");
        list.add("Nemiga");
        list.add("Mac");
        list.add("HP");
        list.remove("HP");
        LOGGER.info("After removing the head.." + list.clone());

        //add MyLinkedList
        MyLinkedList test = new MyLinkedList();
        test.add(150);
        test.add(850);
        test.add(789);
        LOGGER.info(test);
        LOGGER.info(test.get(0));
        test.remove(0);
        LOGGER.info(test);


        // add HashMap
        HashMap <Integer, String> serialNumberAndModelComputer = new HashMap<>();
        serialNumberAndModelComputer.put(14525854, "Lenovo Legion 5 ");
        serialNumberAndModelComputer.put(85975623, "Lenovo L 3");
        serialNumberAndModelComputer.put(74152658, " Lenovo IdeaPad 3");
        serialNumberAndModelComputer.put(89565652, "HP 45100");
        serialNumberAndModelComputer.put(41252521, "HP4310");
        LOGGER.info(serialNumberAndModelComputer.containsKey(7452254)); //check object in map
        String legion = serialNumberAndModelComputer.get(14525854); //get object by key
        LOGGER.info(legion);
        serialNumberAndModelComputer.remove(85975623); //delete object by key
        LOGGER.info(serialNumberAndModelComputer);
        for (Map.Entry entry : serialNumberAndModelComputer.entrySet()) {
            LOGGER.info(entry);
        }


        //use ArrayList in Email
        EMail massage = new EMail("Letter for All", "15");
        LOGGER.info(massage.sizeBoxLetters());
        ///ADD STACK

        //  create computer in office
        Stack<Mouse> office = new Stack<>();
        office.push(new Mouse("Logitech 4310"));
        office.push(new Mouse("Lenovo  38520"));
        office.push(new Mouse("Lenovo Gold "));
        office.push(new Mouse("HP 5000"));
        office.push(new Mouse("Lenovo NeLenovo 2000"));

        //  add shipment
        Stack<Computer> goOut = new Stack<>();

        //  start shipment

        Mouse auto1 = office.pop();
        Mouse auto2 = office.pop();
        Mouse auto3 = office.pop();
        Mouse office1 = office.peek();
        LOGGER.info("Which mice go out from office?");
        LOGGER.info(auto1);
        LOGGER.info(auto2);
        LOGGER.info(auto3);
        LOGGER.info(office1);
        // end of stack

        // ADD QUEUE
        PriorityQueue<String> myPriorityQueue = new PriorityQueue();
        myPriorityQueue.add("Computer Lenovo");
        myPriorityQueue.add("Computer HP");
        myPriorityQueue.add("Computer LG");
        LOGGER.info(myPriorityQueue);


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





