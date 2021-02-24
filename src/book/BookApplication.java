package book;

import book.controller.BookController;
import book.domain.Book;
import book.domain.Page;
import book.repo.BookRepositoryImpl;
import book.service.BookServiceImpl;

public class BookApplication {
    public static void main(String[] args) {
        BookController bookController = new BookController(new BookServiceImpl(new BookRepositoryImpl()));
        bookController.renderViewAllBooks();
        //edits the book
        bookController.renderMessageAfterBookNameUpdated("The Great Gatsby", 3L);
        //display all the books again
        bookController.renderViewAllBooks();
        //deletes a book
        bookController.renderMessageAfterDeletedBook(2L);
        //display all the books again
        bookController.renderViewAllBooks();
        //completed a form
        Book book = new Book("78989", "dhfghdfgh", true, 789);
        book.addPage(new Page("sdfsdf", 0));
        bookController.renderMessageAfterSavedBook(book);
        //display all the books again
        bookController.renderViewAllBooks();
        bookController.renderViewBookByISBNPage("4564565464567");
    }
}
