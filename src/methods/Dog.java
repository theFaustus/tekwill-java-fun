package methods;

public class Dog {
    private String name;
    private String breed;
    private String idNumber;

    public Dog(String name, String breed, String idNumber) {
        this.name = name;
        this.breed = breed;
        //this.idNumber = "ID-" + idNumber;
        setIdNumber(idNumber);
    }

    public String getName() {
        return "Mr." + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = "ID-" + idNumber;
    }

    public void bark() {
        System.out.println("Bark! Bark! Bark!");
    }

    public void run(int numberOfMeters) {
        System.out.println("Running " + numberOfMeters);
    }

    @Override
    public String toString() {
        return "Dog - " + name;
    }
}
