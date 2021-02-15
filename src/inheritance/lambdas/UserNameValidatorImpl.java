package inheritance.lambdas;

public class UserNameValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        return user.getUsername().length() > 0 && user.getUsername().length() < 99;
    }
}
