package inheritance.interfaces;

public class Doctor extends Employee {
    private int surgeryExperienceInHours;

    public void performSurgery() {
        System.out.println("Performing surgery!");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "surgeryExperienceInHours=" + surgeryExperienceInHours +
                ", facebookId='" + facebookId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                '}';
    }
}
