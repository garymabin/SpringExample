package repository;

import entity.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;

public class CarRepository {

    private EntityManager entityManager;

    public CarRepository(@Autowired EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Car getById(String id) {
        Connection con = null;
        PreparedStatement stmt = null;


        try {
            String sql = "SELECT * FROM CAR WHERE ID = ?";
            con = DriverManager.getConnection("localhost:3306/cars");
            stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    Car car = new Car();
                    car.setBrand(resultSet.getString(1));
                    car.setName(resultSet.getString(2));
                    return car;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Car findById(String id) {
        return entityManager.find(Car.class, id);
    }
}
