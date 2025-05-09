package nl.hu.testendpoint.domain;

import java.util.Date;

public class Memory extends Component{
    private String brand;
    private int amount;
    private int memory;
    private int memoryspeed;
    private int timing;
    private int ddrversion;
    private Date releasedate;

    public Memory(int id, String name, String description, double price, String brand, int amount, int memory, int memoryspeed, int timing, int ddrversion, Date releasedate) {
        super(id, "memory", name, description, price);
        this.brand = brand;
        this.amount = amount;
        this.memory = memory;
        this.memoryspeed = memoryspeed;
        this.timing = timing;
        this.ddrversion = ddrversion;
        this.releasedate = releasedate;

    }
    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public int getAmount() { return amount; }
    public int getMemory() { return memory; }
    public int getMemoryspeed() { return memoryspeed; }
    public int getTiming() { return timing; }
    public int getDdrversion() { return ddrversion; }
    public Date getReleasedate() { return releasedate; }

}