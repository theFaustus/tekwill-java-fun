package datatypes.types;

public class PopulationStatistic {
    private long worldPopulationNumber;
    private String description;

    public PopulationStatistic(long worldPopulationNumber, String description) {
        this.worldPopulationNumber = worldPopulationNumber;
        this.description = description;
    }

    @Override
    public String toString() {
        return "PopulationStatistic{" +
                "worldPopulationNumber=" + worldPopulationNumber +
                ", description='" + description + '\'' +
                '}';
    }
}
