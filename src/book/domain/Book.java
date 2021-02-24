package book.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private Long id;
    private String isbn;
    private String name;
    private boolean isRare;
    private int numberOfPages;
    private List<Page> pages = new ArrayList<>();

    public Book(Long id, String isbn, String name, boolean isRare, int numberOfPages) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.isRare = isRare;
        this.numberOfPages = numberOfPages;
    }

    public Book(String isbn, String name, boolean isRare, int numberOfPages) {
        this.isbn = isbn;
        this.name = name;
        this.isRare = isRare;
        this.numberOfPages = numberOfPages;
    }

    public void addPage(Page page) {
        pages.add(page);
        page.setBook(this);
    }

    public void removePage(Page page) {
        pages.remove(page);
        page.setBook(null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRare() {
        return isRare;
    }

    public void setRare(boolean rare) {
        isRare = rare;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isRare == book.isRare && numberOfPages == book.numberOfPages && Objects.equals(id,
                                                                                              book.id) && Objects.equals(
                isbn, book.isbn) && Objects.equals(name, book.name) && Objects.equals(pages,
                                                                                      book.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, name, isRare, numberOfPages, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", isRare=" + isRare +
                ", numberOfPages=" + numberOfPages +
                ", pages=" + pages +
                '}';
    }
}
