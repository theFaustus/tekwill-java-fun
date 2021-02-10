package inheritance.interfaces;

public class Astronaut extends Employee implements Runner {
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

    @Override
    public void run() {
        System.out.println("Astronaut is running");
    }
}
