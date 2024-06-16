package com.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
//数据库连接封装类
public class GetDatabaseConnection {
    public static Connection connnectDB(String DBname,String id,String p){
        Connection con=null;
        String url="jdbc:mysql://localhost:3306"+DBname+"?useSSL=true&characterEncoding=utf-8";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            System.out.println("驱动加载失败");
        }
        try{
            con= DriverManager.getConnection(url,id,p);
        }catch(SQLException e){
            System.out.println("连接失败");
        }
        return con;
    }

}
