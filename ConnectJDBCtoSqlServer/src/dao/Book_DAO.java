package dao;

import Database.JDBCUtil;
import Model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Book_DAO implements DAO_Interface<Book> {
    public static Book_DAO getInstances() {
        return new Book_DAO();
    }
    @Override
    public int add(Book book) {
        // B1: tạo kết nối CSDL
        try {
            Connection conn = JDBCUtil.getConnection();

            // C1: sử dụng statement
//            // Tạo đối tượng statement
//            Statement stm = conn.createStatement();
//            String insertQuery = "insert into Book values('"+book.getId()+"','"+book.getTenSach()+"','"+book.getGiaBan()+"','"+book.getNamXuatBan()+"')";
//
//            int check = stm.executeUpdate(insertQuery);
//            System.out.println(check);


            // C2: sử dụng prepareStatement
            String insertQuery = "insert into Book values(?,?,?,?)";

            // Tạo đối tượng prepareStatement
            PreparedStatement ps = conn.prepareStatement(insertQuery);
            ps.setString(1,book.getId());
            ps.setString(2,book.getTenSach());
            ps.setInt(3,book.getGiaBan());
            ps.setInt(4,book.getNamXuatBan());

            int check = ps.executeUpdate();
            System.out.println(check);

            JDBCUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Book book) {
        // B1: tạo kết nối CSDL
        try {
            Connection conn = JDBCUtil.getConnection();

//            // Tạo đối tượng statement
//            Statement stm = conn.createStatement();
//            String updateQuery = "update Book\n" +
//                    "set bookName = '"+book.getTenSach()+"', price = "+book.getGiaBan()+", year_of_Publish = "+book.getNamXuatBan()+"\n" +
//                    "where ID = '"+book.getId()+"'";
//
//            int check = stm.executeUpdate(updateQuery);
//            System.out.println(check);

            String updateQuery = "update Book\n" +
                    "set bookName = ?, price = ?, year_of_Publish = ?\n" +
                    "where ID = ?";

            // Tạo đối tượng prepareStatement
            PreparedStatement ps = conn.prepareStatement(updateQuery);
            ps.setString(1,book.getTenSach());
            ps.setInt(2,book.getGiaBan());
            ps.setInt(3,book.getNamXuatBan());
            ps.setString(4,book.getId());

            int check = ps.executeUpdate();
            System.out.println(check);

            JDBCUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int remove(Book book) {
        // B1: tạo kết nối CSDL
        try {
            Connection conn = JDBCUtil.getConnection();

//            // Tạo đối tượng statement
//            Statement stm = conn.createStatement();
//            String updateQuery = "delete\n" +
//                    "from Book\n" +
//                    "where ID = '"+book.getId()+"';";
//
//            int check = stm.executeUpdate(updateQuery);
//            System.out.println(check);


            String removeQuery = "delete\n" +
                    "from Book\n" +
                    "where ID = ?";

            // Tạo đối tượng prepareStatement
            PreparedStatement ps = conn.prepareStatement(removeQuery);
            ps.setString(1,book.getId());

            int check = ps.executeUpdate();
            System.out.println(check);

            JDBCUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<Book> selectAll() {
        ArrayList<Book> res = new ArrayList<>();
        // B1: tạo kết nối CSDL
        try {
            Connection conn = JDBCUtil.getConnection();

//            // B2: Tạo đối tượng statement
//            Statement stm = conn.createStatement();
//
//            // B3: Thực thi câu lệnh sql
//            String selectQuery = "select *\n" +
//                    "from Book";
//
//            ResultSet rs = stm.executeQuery(selectQuery);


            String selectQuery = "select *\n" +
                    "from Book";

            // B2: Tạo đối tượng prepareStatement
            PreparedStatement ps = conn.prepareStatement(selectQuery);

            ResultSet rs = ps.executeQuery();

            // B4:
            while (rs.next()) {
                String id = rs.getString("ID");
                String bookName = rs.getString("bookName");
                int price = rs.getInt("price");
                int year_of_Publish = rs.getInt("year_of_Publish");

                Book book = new Book(id,bookName,price,year_of_Publish);
                res.add(book);
            }

            JDBCUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public Book SelectById(Book book) {
        Book res = null;
        // B1: tạo kết nối CSDL
        try {
            Connection conn = JDBCUtil.getConnection();

//            // B2: Tạo đối tượng statement
//            Statement stm = conn.createStatement();
//
//            // B3: Thực thi câu lệnh sql
//            String selectQuery = "select *\n" +
//                    "from Book\n" +
//                    "where ID = '"+book.getId()+"'";
//
//            ResultSet rs = stm.executeQuery(selectQuery);
//            System.out.println(selectQuery);


            String selectQuery = "select *\n" +
                    "from Book\n" +
                    "where ID = ?";

            // B2: Tạo đối tượng prepareStatement
            PreparedStatement ps = conn.prepareStatement(selectQuery);
            ps.setString(1,book.getId());

            ResultSet rs = ps.executeQuery(selectQuery);
            System.out.println(selectQuery);

            // B4:
            while (rs.next()) {
                String id = rs.getString("ID");
                String bookName = rs.getString("bookName");
                int price = rs.getInt("price");
                int year_of_Publish = rs.getInt("year_of_Publish");

                res = new Book(id,bookName,price,year_of_Publish);
            }

            JDBCUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public ArrayList<Book> selectByCondition(String condition) {
        ArrayList<Book> res = new ArrayList<>();
        // B1: tạo kết nối CSDL
        try {
            Connection conn = JDBCUtil.getConnection();

            // B2: Tạo đối tượng statement
            Statement stm = conn.createStatement();

            // B3: Thực thi câu lệnh sql
            String selectQuery = "select *\n" +
                    "from Book\n" +
                    "where "+condition;

            ResultSet rs = stm.executeQuery(selectQuery);

            // B4:
            while (rs.next()) {
                String id = rs.getString("ID");
                String bookName = rs.getString("bookName");
                int price = rs.getInt("price");
                int year_of_Publish = rs.getInt("year_of_Publish");

                Book book = new Book(id,bookName,price,year_of_Publish);
                res.add(book);
            }

            JDBCUtil.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
