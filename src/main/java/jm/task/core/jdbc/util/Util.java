package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String HOST = "jdbc:mysql://localhost:3306/mybasetest?serverTimezone=Europe/Moscow";
    private final String LOGIN = "root";
    private final String PASSWORD = "root1234";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}