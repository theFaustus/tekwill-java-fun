package basics.interfaces.example;

public class Policeman implements Runner {
    @Override
    public void run() {
        System.out.println("Policeman running!");
    }

    public void doPoliceWork() {
        System.out.println("Do police work!");
    }
}
