package datatypes.references;

import java.util.Objects;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Walking!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

}
