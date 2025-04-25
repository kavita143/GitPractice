package com.hexaware.courses.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {



    public static Connection getConnection(){
        List<Integer> l = new ArrayList<>();

        Connection con=null;
        try {
            con= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/hexaware","postgres","postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;

    }
}
