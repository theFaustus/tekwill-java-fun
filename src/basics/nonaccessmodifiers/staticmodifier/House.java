package basics.nonaccessmodifiers.staticmodifier;

public class House {
    static String companyName = "GConstruct";
    int width;
    int length;
    String typeOfWindows;
    String typeOfMaterial = "brick";
    private int height;

    public House(int height, int width, int length, String typeOfWindows, String typeOfMaterial) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.typeOfWindows = typeOfWindows;
        this.typeOfMaterial = typeOfMaterial;
    }

    public House(int height, int width, int length, String typeOfWindows) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.typeOfWindows = typeOfWindows;
    }

    public static void anotherStaticMethod() {

    }

    public static void staticMethod() {
        //typeOfMaterial = "brick"; cannot access instance fields from static methods
        //lightUp(); cannot access instance methods from static methods

        companyName = "GConstructor-2"; // static fields can be accessed from static method
        anotherStaticMethod(); // static methods can be accessed from static method
    }

    public void instanceMethod() {
        staticMethod(); // static can be accessed from instance
        companyName = "GConstructer"; // static can be accessed from instance

        width = 30; // instance can be accessed from instance
        height = 20; // instance can be accessed from instance
        anotherInstanceMethod(); // instance can be accessed from instance

    }

    public void anotherInstanceMethod() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "House{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", typeOfWindows='" + typeOfWindows + '\'' +
                ", typeOfMaterial='" + typeOfMaterial + '\'' +
                '}';
    }
}
