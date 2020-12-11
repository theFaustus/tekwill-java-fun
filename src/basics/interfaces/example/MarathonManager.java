package basics.interfaces.example;

public class MarathonManager {
    public static void main(String[] args) {
//        List<Runner> participants = new ArrayList<>();
//        participants.add(new Developer());
//        participants.add(new Policeman());

        // [developer, policeman]

        System.out.println("Marathon starts > ");
        Runner r = new Policeman();
        r.run();

//        for(Runner runner : participants){
//            runner.run();
//        }

    }
}
