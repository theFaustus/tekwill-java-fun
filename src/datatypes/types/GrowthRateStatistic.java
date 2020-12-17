package datatypes.types;

public class GrowthRateStatistic {
    private float growthRate;
    private String description;

    public GrowthRateStatistic(float growthRate, String description) {
        this.growthRate = growthRate;
        this.description = description;
    }

    @Override
    public String toString() {
        return "GrowthRateStatistic{" +
                "growthRate=" + growthRate +
                ", description='" + description + '\'' +
                '}';
    }
}
