package datatypes.operators.arithmetic;

public class TimeHolder {

    public static final int HOURS_IN_A_DAY = 24;
    public static final int MINUTES_IN_AN_HOUR = 60;
    public static final int SECONDS_IN_A_MINUTE = 60;

    private final long days;
    private final long hours;
    private final long minutes;
    private final long seconds;
    private final long totalSeconds;

    public TimeHolder(long totalSeconds) {
        this.totalSeconds = totalSeconds;
        this.days = getDays(totalSeconds);
        this.hours = getHours(totalSeconds);
        this.minutes = getMinutes(totalSeconds);
        this.seconds = getSeconds(totalSeconds);
    }

    private long getDays(long seconds) {
        return seconds / (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
    }

    private long getHours(long seconds) {
        return (seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
    }

    private long getMinutes(long seconds) {
        return ((seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / SECONDS_IN_A_MINUTE;
    }

    private long getSeconds(long seconds) {
        return (seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE) % SECONDS_IN_A_MINUTE;
    }

    @Override
    public String toString() {
        return "TimeHolder{" +
                "days=" + days +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                ", totalSeconds=" + totalSeconds +
                '}';
    }
}
