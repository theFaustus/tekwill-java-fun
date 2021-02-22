package book;

import book.controller.BookController;
import book.repo.BookRepositoryImpl;
import book.service.BookServiceImpl;

public class BookApplication {
    public static void main(String[] args) {
        BookController bookController = new BookController(new BookServiceImpl(new BookRepositoryImpl()));
        bookController.renderViewBookByISBNPage("123456789");
        bookController.renderViewBookByISBNPage("12345678");
//        System.out.println(bookController.renderViewBookByISBNPage("12345679"));
    }
}
