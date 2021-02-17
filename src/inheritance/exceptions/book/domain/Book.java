package inheritance.exceptions.book.domain;

import java.util.Objects;

public class Book {
    private String isbn;
    private String content;

    public Book(String isbn, String content) {
        this.isbn = isbn;
        this.content = content;
    }

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(content, book.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, content);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
