package flowcontrol.loops;

public class BreakContinueDemo {
    public static void main(String[] args) {

        //no break used
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        //break is used
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }

        System.out.println();
        //continue is used
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }

        //break with no label is used
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1)
                    break;
                System.out.println(j);
            }
        }
        System.out.println();
        //break with label is used
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1)
                    break outer;
                System.out.println(j);
            }
        }

        System.out.println();
        //continue with no label is used
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1)
                    continue;
                System.out.println(j);
            }
        }

        //continue with label is used
        outer2:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1)
                    continue outer2;
                System.out.println(j);
            }
        }

    }
}
