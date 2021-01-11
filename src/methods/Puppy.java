package methods;

public class Puppy extends Dog {
    public Puppy(String name, String breed, String idNumber) {
        super(name, breed, idNumber);
    }

    @Override
    public String toString() {
        return "Puppy";
    }
}
