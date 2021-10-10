import java.util.Scanner;

/**
 * @author Patrik Johansson
 * @author Lucas Åkerlund
 * @author Isabella Jonsson
 */

public class main {

    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        //Här kallar vi in klassen Calculator.
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        //boolean running = true;

        //Förstagångsmeny-header
        System.out.println("* Välkommen till Patriks miniräknare *");
        System.out.println("______________________________________");
        System.out.println("");

        //Hantering av menyval.
        do {
            calculator.printMenu();
            String val = input.nextLine();
            switch (val) {
                case "1" -> calculator.addition();
                case "2" -> calculator.subtraktion();
                case "3" -> calculator.sqrtOf();
                case "4" -> calculator.procent();
                case "5" -> calculator.pythagoras();
                case "6" -> calculator.circleA();
                case "7" -> calculator.hexagonA();
                case "8" -> {
                    System.out.println("\n");
                    System.out.println(TEXT_YELLOW + "Programmet har stoppats.");
                    System.out.println("Tack för att du använde Patriks kalkylator!");
                    System.out.println("Hoppas vi ses snart igen!" + TEXT_RESET);
                    System.out.println("\n");
                    return;
                }
                default -> System.out.println(TEXT_RED + "Fel, välj mellan 1-8" + TEXT_RESET);
            }
            System.out.println();
            System.out.println(TEXT_GREEN + "Tryck enter för att fortsätta." + TEXT_RESET) ;
            input.nextLine();
        } while (true);

    }

}
