package book.domain.exceptions;

public class BookNotFoundCheckedException extends Exception {
    public BookNotFoundCheckedException(String s) {
        super(s);
    }
}
