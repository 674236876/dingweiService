package com;

import java.sql.*;

/**
 * Created by zhugp on 2017/4/25.
 */
public class DB2Test {

    private static Connection con = null;
    private static Statement sql = null;
    private static ResultSet rs = null;
    public static void main(String[] args) {
        String no;
        String dep;
        String sal;
        try {
            con = dbConn("db2inst", "123qweasd");
            if (con == null) {
                System.out.println("连接失败");
                System.exit(0);

            }else{
                System.out.println("连接成功");
            }

            sql = con.createStatement();
            rs = sql.executeQuery("select * from area_info");
            while (rs.next()) {
                no = rs.getString(1);
                dep = rs.getString(2);
                sal = rs.getString(3);
                System.out.println(no + " " + dep + " " + sal);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static Connection dbConn(String db2inst, String s) {
        Connection c = null;
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            c = DriverManager.getConnection("jdbc:db2://42.96.159.2:50000/dingwei", db2inst, s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
}
