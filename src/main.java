import java.util.Scanner;

public class main {

    //Lucas Åkerlund
    //Isabella Jonsson
    //Patrik Johansson

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
        	switch(val) {
            case "1":
                calculator.sqrtOf();
            	break;
            case "2":
                calculator.procent();
                break;
            case "3":
                calculator.pythagoras();
                break;
            case "4":
                calculator.circleA();
                break;
            case "5":
                running = false;
                System.out.println("Programmet har stoppats.");
                return;
            default:
                System.out.println("Fel, välj mellan 1-5");

            }
            System.out.println("Tryck enter för att fortsätta.");
            input.nextLine();
        }while(running);
    }

}
