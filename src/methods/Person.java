package methods;

public class Person {
    static int daysTillEndOfHumanity = 9999; //static variable

    private String firstName; //instance variable

    public void walk(int maxNumberOfSteps) { //method parameter
        int numberOfSteps = 0; //local variable accessible over the entire method
        System.out.println(firstName + " started to walk...");
        for (int i = 0; i < maxNumberOfSteps; i++) { //for local variable
            numberOfSteps++;
            System.out.println(numberOfSteps);
            if (numberOfSteps >= 4) {
                int numberOfRunningSteps = 2; //if local variable
                numberOfSteps += numberOfRunningSteps;
                System.out.println("Started running " + numberOfRunningSteps);
            }
        }
        System.out.println("Still to live we have : " + daysTillEndOfHumanity);

        System.gc();
        Runtime.getRuntime().gc();
    }


}
