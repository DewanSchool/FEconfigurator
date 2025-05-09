package nl.hu.testendpoint.domain;

import java.util.Date;

public class PcCase extends Component{
    private int productid;
    private String brand;
    private String motherboardformat;
    private int fansbottom;
    private int fansside;
    private int maximumcpucoolerheight;
    private int maximumgpulength;
    private int maximumpsulength;
    private int height;
    private int width;
    private int depth;
    private Date releasedate;

    public PcCase(int id, String name, String description, double price, String brand, String motherboardformat, int fansbottom, int fansside, int maximumcpucoolerheight, int maximumgpulength, int maximumpsulength, int height, int width, int depth, Date releasedate) {
        super(id, "pcCase", name, description, price);
        this.brand = brand;
        this.motherboardformat = motherboardformat;
        this.fansbottom = fansbottom;
        this.fansside = fansside;
        this.maximumcpucoolerheight = maximumcpucoolerheight;
        this.maximumgpulength = maximumgpulength;
        this.maximumpsulength = maximumpsulength;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.releasedate = releasedate;
    }

    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public String getMotherboardformat() { return motherboardformat; }
    public int getFansbottom() { return fansbottom; }
    public int getFansside() { return fansside; }
    public int getMaximumcpucoolerheight() { return maximumcpucoolerheight; }
    public int getMaximumgpulength() { return maximumgpulength; }
    public int getMaximumpsulength() { return maximumpsulength; }
    public int getHeight() { return height; }
    public int getWidth() { return width; }
    public int getDepth() { return depth; }
    public Date getReleasedate() { return releasedate; }
}