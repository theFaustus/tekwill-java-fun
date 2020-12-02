package basics.accessmodifiers.apackage;

public class BaseClass {
    public String publicInstanceField;
    public String protectedInstanceField;
    public String defaultInstanceField;
    public String privateInstanceField;
    private BaseClass baseClass;

    public void publicMethod() {
    }

    public void protectedMethod() {
    }

    public void defaultMethod() {
    }

    public void privateMethod() {
    }

    public void checkPublic() {
        publicInstanceField = "value";  //without reference
        publicMethod();        //without reference

        baseClass.publicInstanceField = "value"; //with reference
        baseClass.publicMethod(); //with reference
    }

    public void checkProtected() {
        protectedInstanceField = "value";  //without reference
        protectedMethod();        //without reference

        baseClass.protectedInstanceField = "value"; //with reference
        baseClass.protectedMethod(); //with reference
    }

    public void checkDefault() {
        defaultInstanceField = "value";  //without reference
        defaultMethod();        //without reference

        baseClass.defaultInstanceField = "value"; //with reference
        baseClass.defaultMethod(); //with reference
    }

    public void checkPrivate() {
        privateInstanceField = "value";  //without reference
        privateMethod();        //without reference

        baseClass.privateInstanceField = "value"; //with reference
        baseClass.privateMethod(); //with reference
    }
}
