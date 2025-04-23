package nl.hu.testendpoint.domain;

public class Gpu extends Component{
    private String brand;
    private String gpuserie;
    private String gpumodel;
    private int vram;
    private int businterface;
    private int gpuclock;
    private int memoryclock;
    private String releasedate;

    public Gpu(int id, String name, String description, double price, String brand, String gpuserie, String gpumodel, int vram, int businterface, int gpuclock, int memoryclock, String releasedate) {
        super(id, "gpu", name, description, price);
        this.brand = brand;
        this.gpuserie = gpuserie;
        this.gpumodel = gpumodel;
        this.vram = vram;
        this.businterface = businterface;
        this.gpuclock = gpuclock;
        this.memoryclock = memoryclock;
        this.releasedate = releasedate;

    }

    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public String getGpuserie() { return gpuserie; }
    public String getGpumodel() { return gpumodel; }
    public int getVram() { return vram; }
    public int getBusinterface() { return businterface; }
    public int getGpuclock() { return gpuclock; }
    public int getMemoryclock() { return memoryclock; }
    public String getReleasedate() { return releasedate; }

}