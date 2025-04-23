package nl.hu.testendpoint.domain;

public class Os extends Component{
    private String operatingsystem;

    public Os(int id, String name, String description, double price, String operatingsystem) {
        super(id, "os", name, description, price);
        this.operatingsystem = operatingsystem;
    }

    public int getid() { return super.getId(); }
    public String getName() { return super.getName(); }
    public String getDescription() { return super.getDescription(); }
    public double getPrice() { return super.getPrice(); }
    public String getOperatingsystem() { return operatingsystem; }
}