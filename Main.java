import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Intro intro = new Intro();
        intro.printIntro();
        intro.printMenu();

        Scanner actionScanner = new Scanner(System.in);

        ProcessAction actionHandler = new ProcessAction();

        actionHandler.actionHandle(actionScanner);
    }
}