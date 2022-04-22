package computer;
import computer.enums.TypeOfMonitor;
import computer.interfaces.Supportable;
import org.apache.logging.log4j.LogManager;


public class Monitor implements Supportable {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
    private String modelMonitor;
    private int diagonalMonitor;
    private boolean isConnectorHDMI;
    private boolean isConnectorVDI;
    private boolean isMonitorOff;
    private TypeOfMonitor typeOfMonitor;


    public Monitor(String modelMonitor, int diagonalMonitor, boolean isConnectorHDMI, boolean isConnectorVDI, boolean isMonitorOff) {
        this.modelMonitor = modelMonitor;
        this.isConnectorHDMI = isConnectorHDMI;
        this.isConnectorVDI = isConnectorVDI;
        this.diagonalMonitor = diagonalMonitor;
        this.isMonitorOff = isMonitorOff;
    }

    public Monitor(String modelMonitor, boolean monitorOff) {
        this.modelMonitor = modelMonitor;
        this.isMonitorOff = monitorOff;
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
        this.isConnectorHDMI = connectorHDMI;
    }

    public void setConnectorVDI(boolean connectorVDI) {
        this.isConnectorVDI = connectorVDI;
    }

    public String getmodelMonitor() {
        return modelMonitor;
    }

    public int getdiagonalMonitor() {
        return diagonalMonitor;
    }

    public boolean isConnectorHDMIM() {
        return isConnectorHDMI;
    }

    public boolean isConnectorVDIM() {
        return isConnectorVDI;
    }

    public boolean isMonitorOffM() {
        return isMonitorOff;
    }

    public void offMonitor(boolean monitorOff) {

        if (monitorOff == true)
            LOGGER.info("MonitorOFF!!!");
        else
            LOGGER.info("MonitorON!!!");

    }
    @Override
    public void support() {

    }
    @Override
    public String mySupport() {
        return Supportable.super.mySupport();
    }
}
