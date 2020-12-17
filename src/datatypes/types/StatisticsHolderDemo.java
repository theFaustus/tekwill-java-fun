package datatypes.types;

public class StatisticsHolderDemo {
    public static void main(String[] args) {
        PopulationStatistic populationStatistic = new PopulationStatistic(7894516352L, "current world population");
        GrowthRateStatistic growthRateStatistic = new GrowthRateStatistic(1.05f, "current growth rate of population");
        StatisticsHolder statisticsHolder = new StatisticsHolder(populationStatistic, growthRateStatistic);
        StatisticsHolder statisticsHolderWithSource = new StatisticsHolder(populationStatistic, growthRateStatistic, "Mars CO. INC.");
        System.out.println(statisticsHolder);
        System.out.println(statisticsHolderWithSource);
    }
}
