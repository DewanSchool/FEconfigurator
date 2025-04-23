package nl.hu.testendpoint.domain;

public class CpuCooler extends Component {
    private String brand;
    private String sockets;
    private int sizemm;
    private int heightmm;
    private int sounddb;
    private String releasedate;

    public CpuCooler(int id, String name, String description, double price, String brand, String sockets, int sizemm, int heightmm, int sounddb, String releasedate) {
        super(id, "cpuCooler", name, description, price);
        this.brand = brand;
        this.sockets = sockets;
        this.sizemm = sizemm;
        this.heightmm = heightmm;
        this.sounddb = sounddb;
        this.releasedate = releasedate;

    }
    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public String getSockets() { return sockets; }
    public int getSizemm() { return sizemm; }
    public int getHeightmm() { return heightmm; }
    public int getSounddb() { return sounddb; }
    public String getReleasedate() { return releasedate; }
}