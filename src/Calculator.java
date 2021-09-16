import java.util.Scanner;

public class Calculator {

    //Max och min- värden för kalkylatorn
    final private double MAX_INPUT_VALUE = 1000.0;
    final private double MIN_INPUT_VALUE = 0.0;

    Scanner input;

    public Calculator() {
        input = new Scanner(System.in);
    }

    //Menyfunktion
    public void printMenu() {
        System.out.println("Välj ett av nedan matematiska funktioner att utföra: ");
        System.out.println("1) Roten ur");
        System.out.println("2) Procent");
        System.out.println("3) Pythagoras sats");
        System.out.println("4) Cirkelns area");
        System.out.println("5) Avsluta");
    }

	//Denna metod är värdelös.
    public int getVal(int min, int max) {
        return 0;
    }

	//Denna metod hämtar en användares inmatning.
    public double getVal(double min, double max) {
        System.out.println("Ange ett värde mellan " + min + " och " + max);
        double inputValue = 0;
		//Denna try catch hanterar situationen vid fel inmatning som annars hade kraschat programmet.
        try{
        	inputValue = input.nextDouble();
        } catch(Exception e) {
			System.out.println("Det måste vara ett nummer.");
			input.nextLine();
			return getVal(MIN_INPUT_VALUE,MAX_INPUT_VALUE);
        }
		System.out.println(inputValue);
        if (inputValue >= min && inputValue <= max){
            return inputValue;
        }else {
            System.out.println("Ditt värde är inte inom gränsen");
            getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        }

        return -1;
    }

    //Räknar ut roten ur av användarens inskrivna tal.
    public double sqrtOf() {
        System.out.println("Skriv in ett tal som du vill ta roten ur.");
        int x = (int) getVal(MIN_INPUT_VALUE,MAX_INPUT_VALUE);
        double sqrtOf = Math.sqrt(x);
        System.out.println("Roten ur " + x + " är: " + sqrtOf);
        return sqrtOf;

    }
    //Räknar ut andel av användarens inskrivna tal samt procentsats.
    public double procent() {
        System.out.println("Skriv in ett värde som du vill ta procent av.");
        double total = getVal(MIN_INPUT_VALUE , MAX_INPUT_VALUE);
        System.out.println("Skriv in procenten.");
        double procent = getVal(MIN_INPUT_VALUE , MAX_INPUT_VALUE);
        double value = total * (procent/100);
        System.out.println(procent + "% av " + total + " är: " + value);
        return procent;
    }
    //Räknar ut hypotenusan av användarens inskrivna 2 kateter.
    public double pythagoras() {
        System.out.println("Skriv in en katet.");
        double x = getVal(MIN_INPUT_VALUE , MAX_INPUT_VALUE);
        System.out.println("Skriv in en till katet.");
        double y = getVal(MIN_INPUT_VALUE , MAX_INPUT_VALUE);
        double pythagoras = Math.hypot(x, y);
        System.out.printf("Hypotenusan av " + x + " och " + y + " är: %.2f", pythagoras);
        System.out.println();
        return pythagoras;
    }

    //Räknar ut area av cirkel MHA användarens inskrivna diameter.
    public double circleA() {
        System.out.println("Skriv in din cirkels diameter.");
        double x = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double radie = x / 2;
        double circleA = radie*radie*3.14;
        System.out.println("Cirkens area är: " + circleA);
        return circleA;
    }

}