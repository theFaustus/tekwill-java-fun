package datatypes.types;

public class StatisticsHolder {
    private PopulationStatistic populationStatistic;
    private GrowthRateStatistic growthRateStatistic;
    private String source;

    public StatisticsHolder(PopulationStatistic populationStatistic, GrowthRateStatistic growthRateStatistic) {
        this.populationStatistic = populationStatistic;
        this.growthRateStatistic = growthRateStatistic;
    }

    public StatisticsHolder(PopulationStatistic populationStatistic, GrowthRateStatistic growthRateStatistic, String source) {
        this.populationStatistic = populationStatistic;
        this.growthRateStatistic = growthRateStatistic;
        this.source = source;
    }

    @Override
    public String toString() {
        return "StatisticsHolder{" +
                "\n* populationStatistic=" + populationStatistic +
                ", \n* growthRateStatistic=" + growthRateStatistic +
                ", \n* source='" + source + '\'' +
                '}';
    }
}
