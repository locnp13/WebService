/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.model;

import java.sql.*;
import org.me.entity.Student;

/**
 *
 * @author locnp
 */
public class StudentModel {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/hanu";

    //  Database credentials
    static final String USER = "locnp";
    static final String PASS = "12345678";
    Connection conn = null;

    public Connection connect_to_database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
        }
        return conn;
    }

    public void close_connection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
        }
    }

    public Student getStudent(String so_bao_danh,String ho_va_ten) {
        Connection conn_tmp = connect_to_database();
        Student student = new Student();
        Statement stmt = null;
        String sql;
        sql = "SELECT * FROM hanu.2014_ketquathi WHERE so_bao_danh="+'"'+so_bao_danh+'"'+" OR ho_va_ten="+'"'+ho_va_ten+'"';
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                //Retrieve by column name
                student.setSo_bao_danh(rs.getString("so_bao_danh"));
                student.setHo_va_ten(rs.getString("ho_va_ten"));
                student.setKhoi_nganh(rs.getString("ma_nganh"));
                student.setDiem_mon_1(rs.getFloat("diem_mon_1"));
                student.setDiem_mon_2(rs.getFloat("diem_mon_2"));
                student.setDiem_mon_3(rs.getFloat("diem_mon_3"));  
                System.out.println(student.toString());
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
        }
        return student;
    }
}
