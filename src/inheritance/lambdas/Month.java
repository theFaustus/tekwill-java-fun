package inheritance.lambdas;

import java.util.HashSet;
import java.util.Set;

public class Month {
    //    HashMap<Integer, String> monthNumbersToMonthNames;
//    HashMap<String, Integer> monthNamesToMonthNumbers;
    Set<MonthEntity> months = new HashSet<>();
    private int monthNumber;

    {
        months.add(new MonthEntity(1, "January"));
        months.add(new MonthEntity(2, "February"));
        months.add(new MonthEntity(3, "March"));
        months.add(new MonthEntity(4, "April"));
        months.add(new MonthEntity(5, "May"));
        months.add(new MonthEntity(6, "June"));
        months.add(new MonthEntity(7, "July"));
        months.add(new MonthEntity(8, "August"));
        months.add(new MonthEntity(9, "September"));
        months.add(new MonthEntity(10, "October"));
        months.add(new MonthEntity(11, "November"));
        months.add(new MonthEntity(12, "December"));
//
//        monthNamesToMonthNumbers = new HashMap<>();
//        monthNamesToMonthNumbers.put("January", 1);
//        monthNamesToMonthNumbers.put("February", 2);
//        monthNamesToMonthNumbers.put("March", 3);
//        monthNamesToMonthNumbers.put("April", 4);
//        monthNamesToMonthNumbers.put("May", 5);
//        monthNamesToMonthNumbers.put("June", 6);
//        monthNamesToMonthNumbers.put("July", 7);
//        monthNamesToMonthNumbers.put("August", 8);
//        monthNamesToMonthNumbers.put("September", 9);
//        monthNamesToMonthNumbers.put("October", 10);
//        monthNamesToMonthNumbers.put("November", 11);
//        monthNamesToMonthNumbers.put("December", 12);
    }

    public Month() {
        this(1);
    }

    public Month(int number) {
        this.monthNumber = 1;
        if (number > 1 && number < 12)
            this.monthNumber = number;
    }

    public Month(String monthName) {
        this(1);
        if (months.stream().anyMatch(m -> m.getName().equals(monthName))) {
//            for (MonthEntity month : months)
//                if(month.getName().equals(monthName))
//                    this.monthNumber = month.getNumber();

            this.monthNumber = months.stream()
                    .filter(m -> m.getName().equals(monthName))
                    .findFirst().get().getNumber();
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) new Month();
        else this.monthNumber = monthNumber;
    }

    @Override
    public String toString() {
        return "Month{" +
                "monthNumber=" + monthNumber +
                '}';
    }

    public String getMonthName() {
//        for (MonthEntity month : months) {
//            if(month.getNumber() == getMonthNumber())
//                return month.getName();
//        }
        return months.stream().filter(m -> m.getNumber() == getMonthNumber()).findFirst().get().getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return monthNumber == month.monthNumber;
    }

}