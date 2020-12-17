package datatypes.types;

public class Statistics {
    private final double growthRate;
    private final String firstSourceOfInformation;
    private final String secondSourceOfInformation;
    private long worldPopulation = 789654321L;

    public Statistics(double growthRate, long worldPopulation, String firstSourceOfInformation, String secondSourceOfInformation) {
        this.growthRate = growthRate;
        this.worldPopulation = worldPopulation;
        this.firstSourceOfInformation = firstSourceOfInformation;
        this.secondSourceOfInformation = secondSourceOfInformation;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics(
                1.5,
                7898765416L,
                "Belgium Bureau of Statistics",
                "Mars CO. INC.");
//        statistics.print();
        System.out.println(statistics);
    }


    @Override
    public String toString() {
        return "WORLD POPULATION" +
                "\nCurrent world population=" + worldPopulation +
                "\nat a growth rate=" + growthRate +
                "\nSource 1 = firstSourceOfInformation='" + firstSourceOfInformation + '\'' +
                "\nSource 2 = secondSourceOfInformation='" + secondSourceOfInformation + '\'';
    }


    //    public void print() {
//        System.out.println("WORLD POPULATION");
//        System.out.println("Current world population = " + worldPopulation);
//        System.out.println("At growth rate = " + growthRate);
//        System.out.println("Sources = [" + firstSourceOfInformation + ", " + secondSourceOfInformation + "]");
//    }

    public void refresh() {
        //connect to internet
//        worldPopulation = 78546154321L;
    }


}
