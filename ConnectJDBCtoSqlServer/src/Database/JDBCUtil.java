package Database;

import java.sql.*;

public class JDBCUtil {
//    public static void main(String[] args) {
//        Connection conn = null;
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String Url = "jdbc:sqlserver://LAPTOP-BH0L3U68\\MYSQLSERVER:1433;databaseName=BookStore;encrypt=false;integratedSecurity=false";
//            conn = DriverManager.getConnection(Url, "sa", "27072003");
//            System.out.println("Connect Successful!!!!!!!!!!!!!");
//        } catch (SQLException | ClassNotFoundException e) {
//            System.out.println("Connect Failed!");
//            e.printStackTrace();
//        }
//
//        try {
//            DatabaseMetaData mtdt = conn.getMetaData();
//            System.out.println(mtdt.getDatabaseProductName());
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }
//
//        try {
//            conn.close();
//            System.out.println("Close Successful!!!!!!!!");
//        } catch (SQLException e) {
//            System.out.println("Close Failed!");
//            e.printStackTrace();
//        }
//    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url = "jdbc:sqlserver://LAPTOP-BH0L3U68\\MYSQLSERVER:1433;databaseName=BookStore;encrypt=false;integratedSecurity=false";
            conn = DriverManager.getConnection(Url, "sa", "27072003");
            System.out.println("Connect Successful!!!!!!!!!!!!!");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connect Failed!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
            System.out.println("Close Successful!!!!!!!!");
        } catch (SQLException e) {
            System.out.println("Close Failed!");
            e.printStackTrace();
        }
    }

    public static void printInfo(Connection conn) {
        try {
            DatabaseMetaData mtdt = conn.getMetaData();
            System.out.println(mtdt.getDatabaseProductName());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}