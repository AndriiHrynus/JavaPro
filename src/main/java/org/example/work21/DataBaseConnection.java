package org.example.work21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/work19";
    private static final String USER = "root";
    private static final String PASSWORD = "1111";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
    }
    public static void close(Connection connection) throws SQLException {
        if(!connection.isClosed()&&connection!=null){
            connection.close();
        }
    }
}
