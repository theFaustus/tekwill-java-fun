package basics.executables.intellij;

public class Demo {
    static public void main(String... arguments){
        //command line arguments : ["1", "2", "3", "erte" ]
        //positions                 0     1    2     3
        //arguments[0] = "1"
        //arguments[1] = "2"
        if (arguments[0].equals("dev")) {
            //compute something long and complex
            System.out.println("Computing something complex...");
        }
        System.out.println("Hey, from Intellij\\\"");
        System.out.println("https://jsoup.org/");
        System.out.println("/\\");
    }
}
