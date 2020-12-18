package datatypes.operators.relational;

import datatypes.types.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        boolean c = true;
        boolean d = false;

        boolean x = (a >= b) && (b != 3);
        boolean y = (b >= a) && (b != 5);

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        //System.out.println(a <= c); won`t compile, operands must be comparable

        System.out.println(a = b); // pay attention here

        System.out.println(c = d); // pay attention here

        if (c = d) { // pay attention here, assignment - not equality operator
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println();
        int ab = 5;
        int ac = 4;
        int ad = 9;
        int ae = 10;
        int af = 11;
        int ag = 2;

        System.out.println((ab - ac > ad) && (ab - ac < ae));
        System.out.println((ab - ac > ad) || (ab - ac < ae));
        System.out.println(!(ab - ac > ad));
        System.out.println(!(ab - ac > ad) && (ab - ac < ae));

        boolean userLoggedIn = false;
        boolean userIsAdmin = true;
        boolean userFirstTimeLogin = false;

        //complex logic of authentication
        userLoggedIn = true;

        System.out.println(userLoggedIn && userIsAdmin && !userFirstTimeLogin);

        if (userLoggedIn && userIsAdmin && !userFirstTimeLogin) {
            enableSuperPowers();
        } else {
            enableLamePowers();
        }

//        //short-circuiting in action
//        //userLoggedIn = true;
//        userLoggedIn = false; //enable short circuting for &&
//        if(userLoggedIn && isUserAdmin() && !userFirstTimeLogin){
//            enableSuperPowers();
//        } else {
//            enableLamePowers();
//        }
//
//        userLoggedIn = true; //enable short circuting for ||
//        userIsAdmin = false;
//        if(userLoggedIn || userIsAdmin || !isUserFirstTimeLogin()){
//            enableSuperPowers();
//        } else {
//            enableLamePowers();
//        }


        //short-circuiting in action
        userLoggedIn = false; // if this one is false, there is not point in checking the others
        boolean andShortCircuitResult = userLoggedIn && isUserAdmin() && !userFirstTimeLogin && isUserAdmin() && !userFirstTimeLogin && isUserAdmin() && !userFirstTimeLogin && isUserAdmin() && !userFirstTimeLogin && isUserAdmin() && !userFirstTimeLogin && isUserAdmin() && !userFirstTimeLogin;
        boolean orShortCircuitResult = userLoggedIn || userIsAdmin || !isUserFirstTimeLogin();

        Person p = null;
        //p.age = 13;
        boolean safeNullMarriedChecking = p != null && p.married;
        System.out.println(safeNullMarriedChecking);
        p = new Person();
        safeNullMarriedChecking = p != null || p.married;
        System.out.println(safeNullMarriedChecking);

        int computation = ((3 * 4) + 5) - 7 / 5 + 9;
        Integer computationFirst = ((3 * 4) + 5) - 7 / 5 + 9; //autoboxing


        List<String> stringsList = new ArrayList<>();
        stringsList.add("asdasd");

        List<Person> personList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        Map<String, Integer> integerMap = new HashMap<>();

        //<> you can`t user here a primitive type

    }

    private static void enableLamePowers() {
        System.out.println("Lame powers enabled");
    }

    private static void enableSuperPowers() {
        System.out.println("Super powers enabled");
    }

    private static boolean isUserAdmin() {
        System.out.println("Checking if user is admin...");
        return true;
    }

    private static boolean isUserFirstTimeLogin() {
        System.out.println("Checking if user is first time logged in...");
        return true;
    }
}
