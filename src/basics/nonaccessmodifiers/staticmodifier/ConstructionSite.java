package basics.nonaccessmodifiers.staticmodifier;


import static basics.nonaccessmodifiers.staticmodifier.House.companyName;

public class ConstructionSite {
    public static void main(String[] args) {
        House h1 = new House(1, 2, 3, "soundproof", "brick");
        House h2 = new House(4, 6, 7, "soundproof", "stone");
        House h3 = new House(8, 2, 5, "sandproof", "brick");
        House h4 = new House(8, 2, 5, "sandproof");
        House h5 = null;


        System.out.println(h1.getHeight()); // access instance members via instance reference/object
        System.out.println(h1.width); // access instance members via instance reference/object
        System.out.println(h1.length); // access instance members via instance reference/object
        System.out.println(h1.typeOfMaterial); // access instance members via instance reference/object
        System.out.println(h1.typeOfWindows); // access instance members via instance reference/object
        h1.instanceMethod(); // access instance members via instance reference/object

        companyName = "GConstructor"; //access static/class members via class reference
        House.staticMethod(); //access static/class members via class reference
        System.out.println(companyName);

        System.out.println(h2);
        System.out.println(h2.companyName); //always use class name

        System.out.println(h3);
        System.out.println(h3.companyName); //always use class name
        System.out.println(companyName); //discouraged, do not use
        System.out.println(companyName);
        System.out.println(companyName);
        System.out.println(h4);
        System.out.println(companyName); //can access static members on a null instance reference
    }
}
