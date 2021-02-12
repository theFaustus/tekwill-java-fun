package inheritance.interfaces;

public class Manager extends Employee implements Trainable, Interviewer {
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

    @Override
    public void conductInterview() {
        System.out.println("Manager conducts an interview");
    }

    @Override
    public void attendTraining() {
        System.out.println("Manager attends a training");
    }

    @Override
    public void signContract(String contract) {
        System.out.println("Manager signed contract " + contract);
    }
}
