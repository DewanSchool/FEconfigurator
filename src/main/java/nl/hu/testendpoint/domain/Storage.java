package nl.hu.testendpoint.domain;

import java.util.Date;

public class Storage extends Component {
    private String brand;
    private int storagecapacity;
    private String storageconnection;
    private int readspeed;
    private int diskspeed;
    private String storagetype;
    private Date releasedate;

    public Storage(int id, String name, String description, double price, String brand, int storagecapacity, String storageconnection, int readspeed, int diskspeed, String storagetype, Date releasedate) {
        super(id, "storage", name, description, price);
        this.brand = brand;
        this.storagecapacity = storagecapacity;
        this.storageconnection = storageconnection;
        this.readspeed = readspeed;
        this.diskspeed = diskspeed;
        this.storagetype = storagetype;
        this.releasedate = releasedate;
    }

    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public int getStoragecapacity() { return storagecapacity; }
    public String getStorageconnection() { return storageconnection; }
    public int getReadspeed() { return readspeed; }
    public int getDiskspeed() { return diskspeed; }
    public String getStoragetype() { return storagetype; }
    public Date getReleasedate() { return releasedate; }
}