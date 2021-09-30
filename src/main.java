import java.util.Scanner;

/**
 * @author Patrik Johansson
 * @author Lucas Åkerlund
 * @author Isabella Jonsson
 */

public class main {


    public static void main(String[] args) {

        //Här kallar vi in klassen Calculator.
        Calculator calculator = new Calculator();
		Scanner input = new Scanner(System.in);
        boolean running = true;

        //Hantering av menyval.
        do{
            calculator.printMenu();
            System.out.print("> ");
            String val= input.nextLine();
            switch (val) {
                case "1" -> calculator.addition();
                case "2" -> calculator.subtraktion();
                case "3" -> calculator.sqrtOf();
                case "4" -> calculator.procent();
                case "5" -> calculator.pythagoras();
                case "6" -> calculator.circleA();
                case "7" -> {
                    running = false;
                    System.out.println("\n");
                    System.out.println("Programmet har stoppats.");
                    System.out.println("\n");
                    return;
                }
                default -> System.out.println("Fel, välj mellan 1-7");
            }
            System.out.println("Tryck enter för att fortsätta.");
            input.nextLine();
        }while(running);

    }

}
