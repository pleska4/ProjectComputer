package Computer;

public class SystemUnit {
    private String nameSystemUnit;
    private String procSystemUnit;
    private String cPU;
    private double frequenceCPU;
    private int ssd;
    private int hdd;

    public SystemUnit(String nameSystemUnit, String procSystemUnit, String cPU, int frequenceCPU, int ssd, int hdd) {
        this.nameSystemUnit = nameSystemUnit;
        this.procSystemUnit = procSystemUnit;
        this.cPU = cPU;
        this.frequenceCPU = frequenceCPU;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    public SystemUnit(String nameSystemUnit, int frequenceCPU, int ssd, int hdd) {
        this.nameSystemUnit = nameSystemUnit;
        this.frequenceCPU = frequenceCPU;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    public SystemUnit() {
        this.nameSystemUnit = "Standart";
        this.procSystemUnit = "BelProc";
        this.cPU = "NoName";
        this.frequenceCPU = 3.2;
        this.ssd = 50;
        this.hdd = 20;
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
        this.ssd = ssd;
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
        return ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void memorySystemUnit() {
        int memory = hdd + ssd;
        System.out.println("Memory of Computer: " + memory);
    }
}
