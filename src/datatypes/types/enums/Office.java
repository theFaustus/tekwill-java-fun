package datatypes.types.enums;


public class Office {
    public static void main(String[] args) {
        Developer developer = new Developer("Mike", "Java Developer", Seniority.SENIOR);
        Developer developer2 = new Developer("Mike", "Java Developer", Seniority.MEDIOR);
        Developer developer3 = new Developer("Mike", "C++ Developer", Seniority.SENIOR, Developer.Language.C_PLUS_PLUS);
        Developer developer5 = new Developer("Mike", "C++ Developer", Seniority.SENIOR);
        Developer developer6 = new Developer("Mike", "C++ Developer", Seniority.SENIOR);
        Developer developer7 = new Developer("Mike", "C++ Developer", Seniority.SENIOR);
        Developer developer4 = new Developer("Mike", "Python Developer", Seniority.JUNIOR, Developer.Language.PYTHON);

        System.out.println(developer);
        System.out.println(developer2);
        System.out.println(developer3);
        System.out.println(developer4);
        System.out.println(developer5);
        System.out.println(developer6);
        System.out.println(developer7);

        promote(developer);
        assignToComplexProject(developer2);

        System.out.println(developer.seniority.name());
        System.out.println(developer.seniority);

        System.out.println(developer.seniority.ordinal());
        System.out.println(developer2.seniority.ordinal());
        System.out.println(developer4.seniority.ordinal());
        System.out.println(developer4.seniority.getMaxSalary());

        System.out.println(Seniority.MEDIOR.getMaxSalary());

        Seniority[] values = Seniority.values();
    }

    public static void promote(Developer developer) {
        if (developer.seniority == Seniority.JUNIOR)
            System.out.println("Promoting to MEDIOR");
    }

    public static void assignToComplexProject(Developer developer) {
        if (developer.seniority == Seniority.SENIOR)
            System.out.println("Assigning to complex project");
    }

    public static void teachOthers(Developer developer) {
        if (developer.seniority == Seniority.SENIOR)
            System.out.println("Teaching the juniors");
    }


// WITHOUT ENUMS
//    public static void main(String[] args) {
//        Developer developer = new Developer("Mike", "Java Developer", "nanana");
//        Developer developer2 = new Developer("Mike", "Java Developer", MEDIOR);
//        Developer developer3 = new Developer("Mike", "C++ Developer", SENIOR);
//        Developer developer5 = new Developer("Mike", "C++ Developer", SENIOR);
//        Developer developer6 = new Developer("Mike", "C++ Developer", SENIOR);
//        Developer developer7 = new Developer("Mike", "C++ Developer", SENIOR);
//        Developer developer4 = new Developer("Mike", "Python Developer", JUNIOR);
//
//        System.out.println(developer);
//        System.out.println(developer2);
//        System.out.println(developer3);
//        System.out.println(developer4);
//        System.out.println(developer5);
//        System.out.println(developer6);
//        System.out.println(developer7);
//
//        promote(developer);
//        assignToComplexProject(developer2);
//    }
//
//    public static void promote(Developer developer) {
//        if (developer.seniority.equals(JUNIOR))
//            System.out.println("Promoting to MEDIOR");
//    }
//
//    public static void assignToComplexProject(Developer developer) {
//        if (developer.seniority.equals(SENIOR))
//            System.out.println("Assigning to complex project");
//    }
//
//    public static void teachOthers(Developer developer) {
//        if (developer.seniority.equals(SENIOR))
//            System.out.println("Teaching the juniors");
//    }

}
