package book.service;

import book.domain.Book;

import java.util.List;

public interface BookService {
    Book getBookByIsbn(String isbn);

    List<Book> getAllBooks();

    int updateBookNameByBookId(String newBookName, Long bookId);

    int deleteBook(Long bookId);

    int saveBook(Book book);


}
