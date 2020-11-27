package basics.packages.bar;


import java.time.LocalDate;

class PersonDetails {
    String name;
    LocalDate dateOfBirth; //name of the instance variable camelCase

    String ln; // proper variable name - lastName
    int a; // use a proper variable name - age

    PersonDetails(String name){
        this.name = name;
    }

    public void nothing(){
        //var b = "nanana";
    }

    public void foo(){
        PersonDetails personDetails = new PersonDetails("Peter");

        PersonDetails personDetails1 = new PersonDetails("Jake");

        PersonDetails personDetails2 = new PersonDetails("Kenny");
        PersonDetails personDetails3 = new PersonDetails("Mike");
        PersonDetails personDetails4 = new PersonDetails("Bob");
    }
}
