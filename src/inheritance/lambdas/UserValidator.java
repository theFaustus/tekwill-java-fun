package inheritance.lambdas;

@FunctionalInterface
public interface UserValidator {
    boolean validate(User user);
}
