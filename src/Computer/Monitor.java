package Computer;

public class Monitor {
    private String modelMonitor;
    private int diagonalMonitor;
    private boolean connectorHDMI;
    private boolean connectorVDI;
    private boolean monitorOff;

    public Monitor(String modelMonitor, int diagonalMonitor, boolean connectorHDMI, boolean connectorVDI, boolean monitorOff) {
        this.modelMonitor = modelMonitor;
        this.connectorHDMI = connectorHDMI;
        this.connectorVDI = connectorVDI;
        this.diagonalMonitor = diagonalMonitor;
        this.monitorOff = monitorOff;
    }

    public Monitor(String modelMonitor, boolean monitorOff) {
        this.modelMonitor = modelMonitor;
        this.monitorOff = monitorOff;
    }

    public Monitor() {
        this.modelMonitor = "Standart";
        this.diagonalMonitor = 17;
    }

    public void setModelMonitor(String modelMonitor) {
        this.modelMonitor = modelMonitor;
    }

    public void setdiagonalMonitor(int diagonalMonitor) {
        this.diagonalMonitor = diagonalMonitor;
    }

    public void setConnectorHDMI(boolean connectorHDMI) {
        this.connectorHDMI = connectorHDMI;
    }

    public void setConnectorVDI(boolean connectorVDI) {
        this.connectorVDI = connectorVDI;
    }

    public String getmodelMonitor() {
        return modelMonitor;
    }

    public int getdiagonalMonitor() {
        return diagonalMonitor;
    }

    public boolean isConnectorHDMI() {
        return connectorHDMI;
    }

    public boolean isConnectorVDI() {
        return connectorVDI;
    }

    public boolean isMonitorOff() {
        return monitorOff;
    }

    public void offMonitor() {

        if (monitorOff = true)
            System.out.println("MonitorOFF!!!");
        else
            System.out.println("MonitorON!!!");

    }

}
