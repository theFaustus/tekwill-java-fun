package datatypes.types.enums;

public enum Seniority {
    //JUNIOR, MEDIOR, SENIOR, CONSULTANT, ARCHITECT
    JUNIOR(10, 20),
    MEDIOR(50, 60),
    SENIOR(100, 150),
    CONSULTANT(1000, 1100),
    ARCHITECT(7556, 78948);

    private int minSalary;
    private int maxSalary;

    Seniority(int minSalary, int maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }
}
