package basics.nonaccessmodifiers.finalmodifier;

public final class Person { //cannot be extended
    final int MAX_AGE = 99;
    final int MAX_HEIGHT_IN_METERS;

    public Person(int max_height_in_meters) {
        MAX_HEIGHT_IN_METERS = max_height_in_meters;
    }

    public void doWork() {
        //MAX_AGE = 60; cannot be modified as it is final
        //Math.PI = 54;

    }
}
