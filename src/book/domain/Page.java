package book.domain;

import java.util.Objects;

public class Page {
    private Long id;
    private String content;
    private int pageNumber;

    private Book book;

    public Page(Long id, String content, int pageNumber) {
        this.id = id;
        this.content = content;
        this.pageNumber = pageNumber;
    }

    public Page(Long id, String content, int pageNumber, Book book) {
        this.id = id;
        this.content = content;
        this.pageNumber = pageNumber;
        this.book = book;
    }

    public Page(String content, int pageNumber) {
        this.content = content;
        this.pageNumber = pageNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return pageNumber == page.pageNumber && Objects.equals(id, page.id) && Objects.equals(content,
                                                                                              page.content) && Objects.equals(
                book, page.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, pageNumber, book);
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
