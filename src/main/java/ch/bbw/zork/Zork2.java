package ch.bbw.zork;

import java.util.Scanner;

public class Zork2 {

    public static void main(String[] args) {
        Game zorkgame = new Game();
        zorkgame.play();

        Map map = new Map();

        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.print(">");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("map")) {

            } else {
                System.out.println("Unbekannter Befehl. Versuche es erneut oder gebe 'quit' ein, um zu beenden.");
            }
        } while (!userInput.equalsIgnoreCase("quit"));

        System.out.println("ByeBye");
        scanner.close();
    }

}



