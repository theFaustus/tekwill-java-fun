package javaapi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparaDemo {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee("Mike"));
        employeeSet.add(new Employee("Paul"));
        employeeSet.add(new Employee("Bob"));
        employeeSet.add(new Employee("Peter"));

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        employeeSet = new TreeSet<>(comparator);
        employeeSet.add(new Employee("Mike"));
        employeeSet.add(new Employee("Paul"));
        employeeSet.add(new Employee("Bob"));
        employeeSet.add(new Employee("Peter"));
        System.out.println(employeeSet);


        Employee[] arr = new Employee[]{new Employee("Mike"), new Employee("Bob")};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, comparator.reversed());
        System.out.println(Arrays.toString(arr));


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mike"));
        employeeList.add(new Employee("Paul"));
        employeeList.add(new Employee("Bob"));
        employeeList.add(new Employee("Peter"));

        Collections.sort(employeeList);
        System.out.println(employeeList);
        Collections.sort(employeeList, comparator.reversed());
        System.out.println(employeeList);

    }
}
