package inheritance.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ValidatorDemo {
    public static void main(String[] args) {
        User u = new User("", 23, "pass123");
        User u1 = new User("johndoe3", 23, "pass123");
        User u2 = new User("johndoe2", -1, "pas54645s123");
        User u3 = new User("johndoe4", 23, "pa678678ss123");

//        System.out.println(new PasswordValidatorImpl().validate(u));
//        System.out.println(new UserNameValidatorImpl().validate(u));

//        filterInvalid(Arrays.asList(u, u1, u2, u3), new PasswordValidatorImpl());
        System.out.println();
//        filterInvalid(Arrays.asList(u, u1, u2, u3), new UserNameValidatorImpl());
        System.out.println();
//        filterInvalid(Arrays.asList(u, u1, u2, u3), new AgeValidatorImpl());

//        UserValidator ageValidator = new UserValidator() {
//            @Override
//            public boolean validate(User user) {
//                return user.getAge() > 0 && user.getAge() < 140;
//            }
//        }; using anonymous class

//        UserValidator ageValidator = user -> user.getAge() > 0 && user.getAge() < 140; using a interface for a lambda expression

//        filterInvalid(Arrays.asList(u, u1, u2, u3), (User user) -> {return user.getAge() > 0 && user.getAge() < 140;}); will compile but lots of redundant

        filterInvalid(Arrays.asList(u, u1, u2, u3), user -> user.getAge() > 0 && user.getAge() < 140);
        filterInvalid(Arrays.asList(u, u1, u2, u3), us -> us.getUsername().length() > 0 && us.getUsername().length() < 99);
        filterInvalid(Arrays.asList(u, u1, u2, u3), user -> {
            int numberOfDigits = 0;
            if (user.getPassword().length() < 2) return false;
            for (int i = 0; i < user.getPassword().length(); i++) {
                if (!Character.isLetterOrDigit(user.getPassword().charAt(i))) return false;
                if (Character.isDigit(user.getPassword().charAt(i)) && numberOfDigits <= 2)
                    numberOfDigits++;
            }
            return numberOfDigits >= 2;
        });

        System.out.println();

        filterInvalidWithPredicate(Arrays.asList(u, u1, u2, u3), user -> user.getAge() > 0 && user.getAge() < 140);
        filterInvalidWithPredicate(Arrays.asList(u, u1, u2, u3), us -> us.getUsername().length() > 0 && us.getUsername().length() < 99);
        filterInvalidWithPredicate(Arrays.asList(u, u1, u2, u3), user -> {
            int numberOfDigits = 0;
            if (user.getPassword().length() < 2) return false;
            for (int i = 0; i < user.getPassword().length(); i++) {
                if (!Character.isLetterOrDigit(user.getPassword().charAt(i))) return false;
                if (Character.isDigit(user.getPassword().charAt(i)) && numberOfDigits <= 2)
                    numberOfDigits++;
            }
            return numberOfDigits >= 2;
        });

    }

    public static void filterInvalid(List<User> users, UserValidator userValidator) {
        for (User user : users) {
            if (!userValidator.validate(user))
                System.out.println(user); //could be a much more complex logic
        }
    }

    public static void filterInvalidWithPredicate(List<User> users, Predicate<User> userPredicate) {
        for (User user : users) {
            if (!userPredicate.test(user))
                System.out.println(user); //could be a much more complex logic
        }
    }
}
