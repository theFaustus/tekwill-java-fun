package book.controller;

import book.domain.Book;
import book.domain.exceptions.BookNotFoundCheckedException;
import book.domain.exceptions.ISBNNotSupportedRuntimeException;
import book.service.BookService;

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void renderViewBookByISBNPage(String isbn) {
        //tryToFindLanguage
        if (isbn.length() > 10)
            throw new ISBNNotSupportedRuntimeException("ISBN not supported");

        try {
            Book bookByIsbn = bookService.getBookByIsbn(isbn);
            System.out.println("<h1>Book by ISBN page</h1><p>" + bookByIsbn + "</p>");
        } catch (BookNotFoundCheckedException e) {
//            System.out.println(e.getMessage()); log it at DEBUG level to a file
            System.out.println("<h1>Book by ISBN page</h1><p>N/A</p>");
        } finally {
            System.out.println("<nav>tekwill</nav>");
        }
    }
}
