package basics.accessmodifiers.anotherpackage;

import basics.accessmodifiers.apackage.BaseClass;

public class OtherPackageOtherClass {
    private BaseClass baseClass;

    public void checkPublic() {
        baseClass.publicInstanceField = "value";
        baseClass.publicMethod();
    }

    public void checkProtected() {
        //baseClass.protectedInstanceField = "value"; no access
        //baseClass.protectedMethod(); no access
    }

    public void checkDefault() {
        //baseClass.defaultInstanceField = "value"; no access
        //baseClass.defaultMethod(); no access
    }

    public void checkPrivate() {
        //baseClass.privateInstanceField = "value"; - no access
        //baseClass.privateMethod(); - no access
    }
}
