package book.repo;

import book.domain.Book;
import book.domain.exceptions.BookNotFoundCheckedException;
import book.domain.exceptions.BookNotFoundRuntimeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BookRepositoryImpl implements BookRepository {
    Set<Book> books = new HashSet<>(
            Arrays.asList(new Book("123456789", "nananana", false, 354),
                          new Book("789456123", "lalalala", true, 249)));

    @Override
    public Book findBook(String isbn) throws BookNotFoundRuntimeException, BookNotFoundCheckedException {
//        Book foundBook = null;
//        for (Book b : books) {
//            if (b.getIsbn().equals(isbn))
//                foundBook = b;
//        }
//        if (foundBook == null) {
////            throw new BookNotFoundRuntimeException("Book with isbn=" + isbn + " not found!"); runtime exception
//            throw new BookNotFoundCheckedException("Book with isbn=" + isbn + " not found!");
//        }
//        return foundBook;


        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/book-db?user=postgres&password=123456")) {
            System.out.println("Using long url obtained " + connection.getClientInfo());
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/book-db", "postgres", "123456")){
//            System.out.println("Using user/password obtained " + connection.getClientInfo());
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        Properties properties = new Properties();
//        properties.setProperty("user", "postgres");
//        properties.setProperty("password", "123456");
//
//        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/book-db", properties)){
//            System.out.println("Using props obtained " + connection.getClientInfo());
//        } catch (SQLException e){
//            e.printStackTrace();
//        }

        return null;
    }
}
