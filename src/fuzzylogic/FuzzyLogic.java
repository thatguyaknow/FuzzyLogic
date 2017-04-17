package fuzzylogic;

import java.util.Scanner;

public class FuzzyLogic {

    public static void main(String[] args) {
        oer(1);
    }

    public static void oer(int Timeout) {
        Timeout = Timeout * 1000;
        System.out.println("I will now print Os until exit");
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (input != "exit") {
            System.out.print("o    ");
            try {
                Thread.sleep(Timeout);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
