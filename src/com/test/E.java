package com.test;


import javax.swing.*;
import java.sql.*;

/*
//数据库连接和基础查询
public class E {
    public static void main(String[] args) {
        Connection con=null;
        String url = "jdbc:mysql://127.0.0.1:3306/javatest?user=root&password=&useSSL=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("驱动错误");
        }
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("连接错误");
        }
      try {
          Statement sql = con.createStatement();
          ResultSet rs = sql.executeQuery("SELECT * FROM student ");
          while (rs.next()) {
              String id = rs.getString(1);
              String name = rs.getString(2);
              String sex = rs.getString(3);
              String age = rs.getString(4);
              System.out.printf("%s\t", id);
              System.out.printf("%s\t", name);
              System.out.printf("%s\t", sex);
              System.out.printf("%s\t\n", age);
          }
          con.close();
      }catch(SQLException ee){
              System.out.println(ee);
          }
        }
    }
*/
