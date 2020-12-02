package basics.accessmodifiers.apackage;

public class SamePackageSubClass extends BaseClass {
    private BaseClass baseClass;

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
        //privateInstanceField = "value";  //without reference - no access
        //privateMethod();        //without reference - no access

        //baseClass.privateInstanceField = "value"; //with reference - no access
        //baseClass.privateMethod(); //with reference - no access
    }
}
