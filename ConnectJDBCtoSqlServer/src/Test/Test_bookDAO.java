package Test;

import Model.Book;
import dao.Book_DAO;

import java.util.ArrayList;

public class Test_bookDAO {
    public static void main(String[] args) {
        // test insert
        Book b1 = new Book("CTHC","Chu thuat hoi chien",30000,2022);
        Book b2 = new Book("DrS","Dr. Stone",30000,2022);

        Book_DAO.getInstances().add(b1);
        Book_DAO.getInstances().add(b2);


        // test update
//        Book b3 = new Book("DrS","Dr. Stone",20000,2020);
//        Book_DAO.getInstances().update(b3);


        // test remove
//        Book b4 = new Book("DrS");
//        Book_DAO.getInstances().remove(b4);

//        ArrayList<Book> books = Book_DAO.getInstances().selectAll();
//
//        for (Book book : books) {
//            System.out.println(book.toString());
//        }
//
//        Book find = new Book("DrS");
//        Book book = Book_DAO.getInstances().SelectById(find);
//        System.out.println(book);

//        ArrayList<Book> books = Book_DAO.getInstances().selectByCondition("price > 20000");
//
//        for (Book book : books) {
//            System.out.println(book.toString());
//        }
    }
}
