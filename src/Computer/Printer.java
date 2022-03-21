package Computer;

public class Printer {
    private String modelPrinter;
    private  int summPages;
    private  int timeResource;

    public Printer(String modelPrinter, int summPages, int timeResource) {
        this.modelPrinter = modelPrinter;
        this.summPages = summPages;
        this.timeResource = timeResource;
    }

    public Printer() {
        this.modelPrinter = "HP";
        this.timeResource = 20;
        this.timeResource = 60000;
    }

    public void setModelPrinter(String modelPrinter) {
        this.modelPrinter = modelPrinter;
    }

    public void setSummPages(int summPages) {
        this.summPages = summPages;
    }

    public void setTimeResource(int timeResource) {
        this.timeResource = timeResource;
    }

    public String getModelPrinter() {
        return modelPrinter;
    }

    public int getSummPages() {
        return summPages;
    }

    public int getTimeResource() {
        return timeResource;
    }

    public void printLetter() {
        System.out.println("I'm printing letter now!");
    }

    public static void costPrinter(int costPaper, int costSupport) {
        int summ = costPaper * 150 + costSupport * 200;
        System.out.println("Cost of printer: " + summ);
    }
}

