package basics.packages.bar;


import java.time.LocalDate;

class PersonDetails {

    public static final int FOO_BAR = 5;
    String name;
    LocalDate dateOfBirth; //name of the instance variable camelCase
    int a; // use a proper variable name - age
    String ln; // proper variable name - lastName

    PersonDetails(String name) {
        this.name = name;
    }

    //var b = "nanana";
    public void checkPublic() {
    }

    public void foo() {
        PersonDetails personDetails = new PersonDetails("Peter");

        PersonDetails personDetails1 = new PersonDetails("Jake");

        PersonDetails personDetails2 = new PersonDetails("Kenny");
        PersonDetails personDetails3 = new PersonDetails("Mike");
        PersonDetails personDetails4 = new PersonDetails("Bob");
    }


}
