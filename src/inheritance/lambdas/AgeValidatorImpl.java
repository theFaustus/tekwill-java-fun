package inheritance.lambdas;

public class AgeValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        return user.getAge() > 0 && user.getAge() < 140;
    }
}
