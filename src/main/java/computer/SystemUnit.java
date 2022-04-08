package computer;

import computer.exceptions.VolumeMemoryException;
import java.util.Scanner;

public class SystemUnit {
    private String nameSystemUnit;
    private String procSystemUnit;
    private String cPU;
    private double frequenceCPU;
    private int sdd;
    private int hdd;

    public SystemUnit(String nameSystemUnit, String procSystemUnit, String cPU, int frequenceCPU, int sdd, int hdd) {
        this.nameSystemUnit = nameSystemUnit;
        this.procSystemUnit = procSystemUnit;
        this.cPU = cPU;
        this.frequenceCPU = frequenceCPU;
        this.sdd = sdd;
        this.hdd = hdd;
    }

    public SystemUnit(String nameSystemUnit, int frequenceCPU, int ssd, int hdd) {
        this.nameSystemUnit = nameSystemUnit;
        this.frequenceCPU = frequenceCPU;
        this.sdd = ssd;
        this.hdd = hdd;
    }

    public SystemUnit() {
            }
    public void summMemory() throws VolumeMemoryException {
        Scanner hddd = new Scanner(System.in);
        System.out.print("Add volume HDD: ");
        int hdd = hddd.nextInt();
        if (hdd<=0){
            throw new VolumeMemoryException("Value of HDD should be over 1! ");
        }
        Scanner sddd = new Scanner(System.in);
        System.out.print("Add volume SDD: ");
        int sdd = sddd.nextInt();
        if (sdd<=0|sdd>=5000){
            throw new VolumeMemoryException("Value of SDD should be from 1 to 5000!  ");
        }
        int summ = sdd+hdd;
        System.out.println ("Total memory of your SystemUnit " + summ);
    }
    public void setNameSystemUnit(String nameSystemUnit) {
        this.nameSystemUnit = nameSystemUnit;
    }

    public void setProcSystemUnit(String procSystemUnit) {
        this.procSystemUnit = procSystemUnit;
    }

    public void setCPU(String cPU) {
        this.cPU = cPU;
    }

    public void setFrequenceCPU(double frequenceCPU) {
        this.frequenceCPU = frequenceCPU;
    }

    public void setSsd(int ssd) {
        this.sdd = ssd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getNameSystemUnit() {
        return this.nameSystemUnit;
    }

    public String getProcSystemUnit() {
        return this.procSystemUnit;
    }

    public String getCPU() {
        return cPU;
    }

    public double getFrequenceCPU() {
        return frequenceCPU;
    }

    public int getSsd() {
        return sdd;
    }

    public int getHdd() {
        return hdd;
    }

    public void memorySystemUnit() {
        int memory = hdd + sdd;
        System.out.println("Memory of Computer: " + memory);
    }

}
