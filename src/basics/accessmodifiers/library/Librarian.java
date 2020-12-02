package basics.accessmodifiers.library;

public class Librarian {
    Book book;

    public void checkPublic() {
        book.publicIsbn = "value";
        book.publicPrint();
    }

    public void checkProtected() {
        book.protectedIsbn = "value";
        book.protectedPrint();
    }

    public void checkDefault() {
        book.defaultIsbn = "value";
        book.defaultPrint();
    }

    public void checkPrivate() {
        int test; // on local variables no access modifier

        //book.privateIsbn = "value"; - no access
        //book.privatePrint(); - no access
    }
}
