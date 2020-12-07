package basics.nonaccessmodifiers.finalmodifier;

public class SuperManager extends Manager {
    public void doWork() {
        System.out.println("do super work");
    }

//    public void attendMeetings(){ cannot be overridden as it is final
//        System.out.println("attend super meetings");
//    }

}
