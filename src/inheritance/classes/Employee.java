package inheritance.classes;

public class Employee extends Person {
    protected String facebookId;
    protected String address;
    protected String phoneNumber;
    protected float experience;

    public void reportWorkHours() {
        System.out.println("Reporting my hours...");
        //logic to get hours
    }

    public void signContract(String contract) {
        System.out.println("Signed : " + contract);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "facebookId='" + facebookId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public void live() {
        System.out.println("Employee living...");
    }
}
