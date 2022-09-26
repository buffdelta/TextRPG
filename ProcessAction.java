
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ProcessAction {


    public ProcessAction() {

    }

    public void startMenu(Scanner scanner) {

        System.out.println("Time to create a new Character!\n\tEnter a name below!");
        String name = scanner.next();

        System.out.println("\tChoose your class.\n\t1. Knight\n\t2. Mage\n\t3. Thief\n");
        String playerClass = scanner.next();
        playerClass = playerClass.toLowerCase();


        KnightClass playerClass1 = null;
        switch (playerClass) {
            case "1.":
            case "knight":

                playerClass1 = new KnightClass();
                System.out.println(playerClass1.getHp());

                break;
            case "2.":
            case "mage":
                //FIXME class = mage
                break;
            case "3.":
            case "thief":
                //FIXME class = thief
                break;
            default:
                //FIXME command unknown try again
                break;

        }

        System.out.println("\tChoose your birthplace\n\t1. Corinthia\n\t2. Avengale\n\t3. Evermore\n");
        String birthPlace = scanner.next();
        birthPlace = birthPlace.toLowerCase();

        switch (birthPlace) {
            case "1.":
            case "corinthia":
                //FIXME birthplace = corinthia
                break;
            case "2.":
            case "avengale":
                //FIXME birthplace = avengale
                break;
            case "3.":
            case "evermore":
                //FIXME birthplace =evermore
                break;
            default:
                //FIXME unknown command try again
                break;
        }

        Player playerOne = new Player(name, playerClass1, birthPlace);

    }

    public void actionHandle(Scanner scnr) {
        String action = scnr.next();
        action = action.toLowerCase();
        readFile saveFile;
        readFile loadFile;
        Player playerOne;

            switch (action) {

                case "start":

                    startMenu(scnr);

                    break;

                case "load":
                    System.out.println("Specify the file you would like to load in to");
                        loadFile = new readFile(scnr.next());
                        loadFile.loadPlayerData();

                    break;
                case "quit":
                    System.out.println("Would you like to save?");
                        if (scnr.next().equalsIgnoreCase("yes")) {
                            System.out.println("Specify the file you would like to save to");
                            saveFile = new readFile(scnr.next());

                        } else {
                            System.out.println("See you next time, adventurer.");
                            System.exit(0);
                        }

                    break;

                default:
                    System.out.println("Unknown Command\n");
                    actionHandle(scnr);
                    break;


        }
    }
}
