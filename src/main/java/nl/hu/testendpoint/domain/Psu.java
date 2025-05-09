package nl.hu.testendpoint.domain;

import java.util.Date;

public class Psu extends Component {
    private String brand;
    private int power;
    private String certificate80plus;
    private Date releasedate;


    public Psu(int id, String name, String description, double price, String brand, int power, String certificate80plus, Date releasedate) {
        super(id, "psu", name, description, price);
        this.brand = brand;
        this.power = power;
        this.certificate80plus = certificate80plus;
        this.releasedate = releasedate;

    }

    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getBrand() { return brand; }
    public int getPower() { return power; }
    public String getCertificate80plus() { return certificate80plus; }
    public Date getReleasedate() { return releasedate; }
}