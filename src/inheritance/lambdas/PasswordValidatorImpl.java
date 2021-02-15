package inheritance.lambdas;

public class PasswordValidatorImpl implements UserValidator {

    public static final int MIN_PASSWORD_LENGTH = 12;
    public static final int MIN_NUMBER_OF_DIGITS = 2;

    @Override
    public boolean validate(User user) {
        int numberOfDigits = 0;
        if (user.getPassword().length() < MIN_PASSWORD_LENGTH) return false;
        for (int i = 0; i < user.getPassword().length(); i++) {
            if (!Character.isLetterOrDigit(user.getPassword().charAt(i))) return false;
            if (Character.isDigit(user.getPassword().charAt(i)) && numberOfDigits <= MIN_NUMBER_OF_DIGITS)
                numberOfDigits++;
        }
        if (numberOfDigits < MIN_NUMBER_OF_DIGITS)
            return false;
        return true;
    }
}
