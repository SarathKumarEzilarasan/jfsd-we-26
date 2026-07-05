package com.demo.jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        String query = "select * from customers";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/w3schools?" +
                "user=root&password=Rsjep@1993")) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }
        }

    }
}

// jdbc -> hibernate -> ORM [Object Relationship Mapping]