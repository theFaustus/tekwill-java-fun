package basics.accessmodifiers.building;

import basics.accessmodifiers.library.Book;

public class StoryBook extends Book {
    Book book;

    public void checkPublic() {
        publicIsbn = "value";  //without reference
        publicPrint();        //without reference

        book.publicIsbn = "value"; //using reference
        book.publicPrint(); //using reference
    }

    public void checkProtected() {
        protectedIsbn = "value";  //without reference
        protectedPrint();        //without reference

        //book.protectedIsbn = "value"; //using reference - no access
        //book.protectedPrint(); //using reference - no access
    }

    public void checkDefault() {
        //defaultIsbn = "value";  //without reference - no access
        //defaultPrint();        //without reference - no access

        //book.defaultIsbn = "value"; //using reference - no access
        //book.defaultPrint(); //using reference - no access
    }

    public void checkPrivate() {
        //book.privateIsbn = "value"; - no access
        //book.privatePrint(); - no access

        //book.privateIsbn = "value"; //using reference - no access
        //book.privatePrint(); //using reference - no access
    }
}
