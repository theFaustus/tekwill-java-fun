package datatypes.types;

public class Statistics {
    private final double growthRate = 1.05;
    private final String firstSourceOfInformation = "Nanananana";
    private long worldPopulation = 789465465445L;

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        double newtonianConstantOfGravitation = MathConstants.NEWTONIAN_CONSTANT_OF_GRAVITATION;
        System.out.println(statistics.worldPopulation);
        System.out.println(statistics.growthRate);
        System.out.println(statistics.firstSourceOfInformation);


    }

    public void refresh() {
        //connect to internet
        worldPopulation = 78546154321L;
    }


}
