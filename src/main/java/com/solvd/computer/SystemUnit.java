package com.solvd.computer;

import computer.exceptions.VolumeMemoryException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class SystemUnit {
    private static final Logger LOGGER = LogManager.getLogger(SystemUnit.class);
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
        LOGGER.info("Add volume HDD: ");
        int hdd = hddd.nextInt();
        if (hdd <= 0) {
            throw new VolumeMemoryException("Value of HDD should be over 1! ");
        }
        Scanner sddd = new Scanner(System.in);
        LOGGER.info("Add volume SDD: ");
        int sdd = sddd.nextInt();
        if (sdd <= 0 | sdd >= 5000) {
            throw new VolumeMemoryException("Value of SDD should be from 1 to 5000!  ");
        }
        int summ = sdd + hdd;
        LOGGER.info("Total memory of your SystemUnit " + summ);
    }

    public String getNameSystemUnit() {
        return this.nameSystemUnit;
    }

    public void setNameSystemUnit(String nameSystemUnit) {
        this.nameSystemUnit = nameSystemUnit;
    }

    public String getProcSystemUnit() {
        return this.procSystemUnit;
    }

    public void setProcSystemUnit(String procSystemUnit) {
        this.procSystemUnit = procSystemUnit;
    }

    public String getCPU() {
        return cPU;
    }

    public void setCPU(String cPU) {
        this.cPU = cPU;
    }

    public double getFrequenceCPU() {
        return frequenceCPU;
    }

    public void setFrequenceCPU(double frequenceCPU) {
        this.frequenceCPU = frequenceCPU;
    }

    public int getSsd() {
        return sdd;
    }

    public void setSsd(int ssd) {
        this.sdd = ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void memorySystemUnit(int hdd, int sdd) {
        int memory = hdd + sdd;
        LOGGER.info("Memory of Computer: " + memory);
    }

}
