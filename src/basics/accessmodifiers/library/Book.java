package basics.accessmodifiers.library;

public class Book { // can be package-private/default also, accessible just inside the package
    //public access modifier
    public String publicIsbn;
    //protected access modifier
    protected String protectedIsbn;
    ;
    //default(package-private) access modifier
    String defaultIsbn;
    //private access modifier
    private String privateIsbn;
    ;
    private Book book;

    public Book publicPrint() {
        return new Book();
    }

    ;

    protected Book protectedPrint() {
        return new Book();
    }

    Book defaultPrint() {
        return new Book();
    }

    ;

    private Book privatePrint() {
        return new Book();
    }

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
        privateIsbn = "value";  //without reference
        privatePrint();        //without reference

        book.privateIsbn = "value"; //with reference
        book.privatePrint(); //with reference
    }

}
