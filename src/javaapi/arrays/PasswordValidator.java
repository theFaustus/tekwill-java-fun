package javaapi.arrays;

public class PasswordValidator {

    public static final int MIN_PASSWORD_LENGTH = 12;
    public static final int MIN_NUMBER_OF_DIGITS = 2;

    public static void main(String[] args) {
        System.out.println(PasswordValidator.validate("asdasdasdasd"));
        System.out.println(PasswordValidator.validate("asdasdasdasd1"));
        System.out.println(PasswordValidator.validate("asda"));
        System.out.println(PasswordValidator.validate("asda12sefsdf!"));
        System.out.println(PasswordValidator.validate("asda12sefsdf"));
    }


    public static boolean validate(String password) {


        int numberOfDigits = 0;
        if (password.length() < MIN_PASSWORD_LENGTH) return false;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) return false;
            if (Character.isDigit(password.charAt(i)) && numberOfDigits <= MIN_NUMBER_OF_DIGITS)
                numberOfDigits++;
        }
        if (numberOfDigits < MIN_NUMBER_OF_DIGITS)
            return false;
        return true;
    }


}
