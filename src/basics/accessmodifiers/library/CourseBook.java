package basics.accessmodifiers.library;

public class CourseBook extends Book {
    Book book;

    public void checkPublic() {
        publicIsbn = "value";  //without reference
        publicPrint();        //without reference

        book.publicIsbn = "value"; //with reference
        book.publicPrint(); //with reference
    }

    public void checkProtected() {
        protectedIsbn = "value";  //without reference
        protectedPrint();        //without reference

        book.protectedIsbn = "value"; //with reference
        book.protectedPrint(); //with reference
    }

    public void checkDefault() {
        defaultIsbn = "value";  //without reference
        defaultPrint();        //without reference

        book.defaultIsbn = "value"; //with reference
        book.defaultPrint(); //with reference
    }

    public void checkPrivate() {
        //privateIsbn = "value";  //without reference - no access
        //privatePrint();        //without reference - no access

        //book.privateIsbn = "value"; //with reference - no access
        //book.privatePrint(); //with reference - no access
    }
}
