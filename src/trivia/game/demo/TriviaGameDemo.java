package trivia.game.demo;

import trivia.game.engine.TriviaGame;

public class TriviaGameDemo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean gameMenuRunning = true;
//        do {
//            System.out.println("Enter [START] to start the game or [EXIT] to quit...");
//            String response = scanner.nextLine();
//            if (response.equalsIgnoreCase("START")) {
//                new TriviaGame().startGame();
//            } else if (response.equalsIgnoreCase("EXIT")) {
//                System.out.println("Bye, bye!");
//                gameMenuRunning = false;
//            } else {
//                System.out.println("Enter [START] to start the game or [EXIT] to quit...");
//            }
//
//        } while (gameMenuRunning);

        new TriviaGame().startGame();
    }
}
