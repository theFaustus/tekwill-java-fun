package inheritance.classes;

public class Astronaut extends Employee {
    private int hoursInSpace;

    public void fixSpaceStation() {
        System.out.println("Fixing space station!");
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "hoursInSpace=" + this.hoursInSpace +
                ", facebookId='" + super.facebookId + '\'' +
                ", name='" + super.name + '\'' +
                ", address='" + super.address + '\'' +
                ", phoneNumber='" + super.phoneNumber + '\'' +
                ", experience=" + super.experience +
                '}';
    }
}
