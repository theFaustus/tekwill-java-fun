package flowcontrol.ifconstruction;

import datatypes.types.enums.Developer;
import datatypes.types.enums.Seniority;

public class IfDemo {
    public static void main(String[] args) {
        Developer mike = new Developer("Mike", "Developer", Seniority.MEDIOR, Developer.Language.JAVA);
        Developer john = new Developer("John", "Engineer", Seniority.SENIOR, Developer.Language.C_PLUS_PLUS);

        promoteToSenior(mike);
        assignToProject(mike);
        attendTraining(mike);
        attendExpensiveTraining(mike);
        trainATeam(mike);

        System.out.println();

        promoteToSenior(john);
        assignToProject(john);
        attendTraining(john);
        attendExpensiveTraining(john);
        trainATeam(john);

    }

    public static void promoteToSenior(Developer developer) {
// BE CAREFUL, MISSING BRACES!!!, Java won`t take into consideration your identation level, just the first instruction will be executed as a part of the if
//        if (developer.seniority == Seniority.MEDIOR)
//            System.out.println(developer + " promoting to SENIOR");
//            System.out.println("Sending congrats email to " + developer);

        if (developer.seniority == Seniority.MEDIOR) {
            System.out.println(developer + " promoting to SENIOR");
            System.out.println("Sending congrats email to " + developer);
        }

// WON`T WORK, needs the TRUE branch
//        if(developer.seniority == Seniority.MEDIOR)
//        else
//            System.out.println(developer + " promoting to NANANA");

// WILL WORK, but do we really need it?
//        if(developer.seniority == Seniority.MEDIOR)
//        {}
//        else
//            System.out.println(developer + " promoting to NANANA");

// A MUCH BETTER APPROACH, invert the condition if you need just one branch
//        if (developer.seniority != Seniority.MEDIOR) {
//            System.out.println(developer + " promoting to NANANA");
//        }


    }

    public static void assignToProject(Developer developer) {
        if (developer.seniority == Seniority.JUNIOR) {
            System.out.println(developer + " assigning to an easy project");
        } else {
            System.out.println(developer + " assigning to a more complex project");
        }
    }

    public static void attendTraining(Developer developer) {
        if (developer.language == Developer.Language.JAVA) {
            System.out.println(developer + " attending a Java conference");
        } else if (developer.language == Developer.Language.C_PLUS_PLUS) {
            System.out.println(developer + " attending a C++ conference");
        } else if (developer.language == Developer.Language.PYTHON) {
            System.out.println(developer + " attending a Python conference");
        } else {
            System.out.println(developer + " attending a All-Language conference");
        }
    }

    public static void attendExpensiveTraining(Developer developer) {
        if (developer.language == Developer.Language.JAVA && developer.seniority == Seniority.SENIOR) {
            System.out.println(developer + " attending a Java expensive conference");
        } else if (developer.language == Developer.Language.C_PLUS_PLUS && developer.seniority == Seniority.SENIOR) {
            System.out.println(developer + " attending a C++ expensive conference");
        } else if (developer.language == Developer.Language.PYTHON && developer.seniority == Seniority.SENIOR) {
            System.out.println(developer + " attending a Python expensive conference");
        } else {
            System.out.println(developer + " attending a All-Language expensive conference");
        }
    }

    public static void trainATeam(Developer developer) {
        //if((!isConsultant(developer) && developer.name.equals("Mike")) || developer.language == Developer.Language.JAVA)
        if (isConsultant(developer)) {
            System.out.println(developer + " training a team");
        } else {
            System.out.println("Go Learn!");
        }
    }


    public static boolean isConsultant(Developer developer) {
        return developer.seniority == Seniority.CONSULTANT;
    }
}
