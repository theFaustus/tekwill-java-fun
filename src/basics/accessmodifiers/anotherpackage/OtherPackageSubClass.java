package basics.accessmodifiers.anotherpackage;

import basics.accessmodifiers.apackage.BaseClass;

public class OtherPackageSubClass extends BaseClass {
    private BaseClass baseClass;

    public void checkPublic() {
        publicInstanceField = "value";  //without reference
        publicMethod();        //without reference

        baseClass.publicInstanceField = "value"; //using reference
        baseClass.publicMethod(); //using reference
    }

    public void checkProtected() {
        protectedInstanceField = "value";  //without reference
        protectedMethod();        //without reference

        //baseClass.protectedInstanceField = "value"; //using reference - no access
        //baseClass.protectedMethod(); //using reference - no access
    }

    public void checkDefault() {
        //defaultInstanceField = "value";  //without reference - no access
        //defaultMethod();        //without reference - no access

        //baseClass.defaultInstanceField = "value"; //using reference - no access
        //baseClass.defaultMethod(); //using reference - no access
    }

    public void checkPrivate() {
        //baseClass.privateInstanceField = "value"; - no access
        //baseClass.privateMethod(); - no access

        //baseClass.privateInstanceField = "value"; //using reference - no access
        //baseClass.privateMethod(); //using reference - no access
    }
}
