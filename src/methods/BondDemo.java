package methods;

public class BondDemo {
    public static int price = 5;

    public static boolean sell() {

        if (price < 10) { // if
            return true;  // return
        } else if (price >= 10) { // else if
            return false; // return
        }

        //missing return statement
        return false; // in case we did not meet any of the branching conditions from above
    }
}
