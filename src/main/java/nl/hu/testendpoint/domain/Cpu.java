package nl.hu.testendpoint.domain;

import java.util.Date;

public class Cpu extends Component {
    private String brand;
    private String processorserie;
    private String processormodel;
    private String socket;
    private int clockspeed;
    private int cores;
    private String integradedgraphics;
    private int tdp;
    private Date releasedate;

    public Cpu(int id, String name, String description, double price, String brand, String processorserie, String processormodel, String socket, int clockspeed, int cores, String integradedgraphics, int tdp, Date releasedate) {
        super(id, "cpu", name, description, price);
        this.brand = brand;
        this.processorserie = processorserie;
        this.processormodel = processormodel;
        this.socket = socket;
        this.clockspeed = clockspeed;
        this.cores = cores;
        this.integradedgraphics = integradedgraphics;
        this.tdp = tdp;
        this.releasedate = releasedate;
    }

    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public String getProcessorserie() { return processorserie; }
    public String getProcessormodel() { return processormodel; }
    public String getSocket() { return socket; }
    public int getClockspeed() { return clockspeed; }
    public int getCores() { return cores; }
    public String getIntegradedgraphics() { return integradedgraphics; }
    public int getTdp() { return tdp; }
    public Date getReleasedate() { return releasedate; }

}
