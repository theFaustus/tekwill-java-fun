package inheritance.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdasDemo {
    public static void main(String[] args) {
        User u0 = new User("", 23, "pass123");

        User u1 = new User("johndoe3", 23, "pass123");
        User u2 = new User("johndoe2", -1, "pas54645s123");
        User u3 = new User("johndoe4", 23, "pa678678ss123");
        User u4 = new User("johndoe4", 23, "pa678678ss123");

        List<User> users = new ArrayList<>(Arrays.asList(u0, u1, u2, u3, u4));

        System.out.println(users);
        users.removeIf(u -> u.getUsername().isEmpty());
        System.out.println(users);

        users.forEach(u -> System.out.println(u));

        List<String> collected = users.stream()
                .filter(user -> user.getAge() > 0)
                .skip(1)
                .distinct()
                .map(user -> user.getUsername())
                .collect(Collectors.toList());
        System.out.println(collected);

        System.out.println(users.stream().anyMatch(u -> u.getUsername().contains("3")));

        String collected2 = users.stream()
                .filter(user -> user.getAge() > 0)
                .distinct()
                .map(user -> user.getUsername())
                .collect(Collectors.joining(" | ", "[", "]"));

        System.out.println(collected2);

        User[] usersArray = new User[]{u1, u2, u3, u4};

        Stream.of(usersArray)
                .filter(user -> user.getAge() > 0)
                .distinct()
                .map(user -> user.getUsername())
                .collect(Collectors.joining(" | ", "[", "]"));

        Arrays.stream(usersArray)
                .filter(user -> user.getAge() > 0)
                .distinct()
                .map(user -> user.getUsername())
                .collect(Collectors.joining(" | ", "[", "]"));

        IntStream.of(1, -5, 5, 4).sorted().forEach(i -> System.out.println(i));
        DoubleStream.iterate(1.0f, value -> value = value + 1).limit(15).forEach(d -> System.out.println(d));


    }
}
