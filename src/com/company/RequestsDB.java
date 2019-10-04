package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestsDB {

  /*  public void requestsDB( Connection connection ) {
        PreparedStatement statement;

        try {
            String sql;

            sql = "SELECT * FROM developers";

            ResultSet resultSet = connection.executeQuery(sql);


            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialty = resultSet.getString("specialty");
                int salary = resultSet.getInt("salary");
                System.out.println("\n================\n");
                System.out.println("id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Specialty: " + specialty);
                System.out.println("Salary: $" + salary);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }*/
}
