package basics.accessmodifiers.apackage;

public class SamePackageOtherClass {
    private BaseClass baseClass;

    public void checkPublic() {
        baseClass.publicInstanceField = "value";
        baseClass.publicMethod();
    }

    public void checkProtected() {
        baseClass.protectedInstanceField = "value";
        baseClass.protectedMethod();
    }

    public void checkDefault() {
        baseClass.defaultInstanceField = "value";
        baseClass.defaultMethod();
    }

    public void checkPrivate() {
        int test; // on local variables no access modifier

        //baseClass.privateInstanceField = "value"; - no access
        //baseClass.privateMethod(); - no access
    }
}
