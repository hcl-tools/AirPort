package com.airport.dao;

import java.sql.*;

public class DatabaseHandler {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public DatabaseHandler() {}

    public boolean doConnect() {
        try {
            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://165.227.20.110:3306/airport";
            Class.forName(driverName);
            con = DriverManager.getConnection(url, "airport", "airportdbpass");
            System.out.println(con != null ? "connection established" : "connection failed");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("There is no respective jars : "
                    + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            return !(con.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public ResultSet doStatement(String sqlStatement) {
        try {
            PreparedStatement pd = con.prepareStatement(sqlStatement);
            return pd.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Object doUpdate(String sqlStatement) {
        try {
            PreparedStatement pd = con.prepareStatement(sqlStatement);
            return pd.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean doClose() {
        try {
            con = null;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
