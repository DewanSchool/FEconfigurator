package nl.hu.testendpoint.services;

import nl.hu.testendpoint.domain.Component;
import nl.hu.testendpoint.persistence.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComponentService {
    private int id;
    private String name;
    private List<Component> components;

    public ComponentService(int id, String name, List<Component> components) {
        this.id = id;
        this.name = name;
        this.components = components;
    }
    public static ComponentService getComponents() {
        List<Component> components = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM product order by productID asc;";
            try (PreparedStatement statement = conn.prepareStatement(sql);
                 ResultSet set = statement.executeQuery()) {

                while (set.next()) {
                    components.add(new Component(
                            set.getInt("productID"),
                            set.getString("type"),
                            set.getString("name"),
                            set.getString("description"),
                            set.getDouble("price")
                    ){});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ComponentService(0, "All Components", components);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Component> getAllComponents() {
        return components;
    }
}

