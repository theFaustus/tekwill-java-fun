package basics.accessmodifiers.building;

import basics.accessmodifiers.library.Book;

public class House {
    Book book;

    public void checkPublic() {
        book.publicIsbn = "value";
        book.publicPrint();
    }

    public void checkProtected() {
        //book.protectedIsbn = "value"; no access
        //book.protectedPrint(); no access
    }

    public void checkDefault() {
        //book.defaultIsbn = "value"; no access
        //book.defaultPrint(); no access
    }

    public void checkPrivate() {
        //book.privateIsbn = "value"; - no access
        //book.privatePrint(); - no access
    }
}
