package inheritance.classes;

public class Manager extends Employee {
    private int teamSize;

    public void reportProjectStatus() {
        System.out.println("Project status : All good!");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "facebookId='" + facebookId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                ", teamSize=" + teamSize +
                '}';
    }
}
