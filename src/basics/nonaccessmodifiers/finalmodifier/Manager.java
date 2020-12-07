package basics.nonaccessmodifiers.finalmodifier;

public class Manager /*extends Person*/ { //cannot extend a final class

    public void doWork() {
        System.out.println("do work");
    }

    final public void attendMeetings() {
        System.out.println("attend meetings");
    }
}
