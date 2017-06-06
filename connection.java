package hms;

import java.sql.*;

public class connection {

    public Connection getConnect() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String s = "jdbc:mysql://localhost:3306/hospital";
            cn = DriverManager.getConnection(s, "root", "password");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
        return cn;
    }
}
