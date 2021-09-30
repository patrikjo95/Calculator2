import java.util.Scanner;

public class Calculator {

    final private double MAX_INPUT_VALUE = 1000;
    final private double MIN_INPUT_VALUE = -1000;

    Scanner input;

    public Calculator() {
        input = new Scanner(System.in);
    }

    //Menyfunktion
    public void printMenu() {
        System.out.println("* Välkommen till Patriks miniräknare *");
        System.out.println("___________________________________");
        System.out.println("");
        System.out.println("Välj ett av nedan matematiska funktioner att utföra: ");
        System.out.println("1) Addition");
        System.out.println("2) Subtraktion");
        System.out.println("3) Roten ur");
        System.out.println("4) Procent");
        System.out.println("5) Pythagoras sats");
        System.out.println("6) Cirkelns area");
        System.out.println("7) Avsluta");
    }

    //Denna metod är värdelös.
    public int getVal(int min, int max) {
        return 0;
    }

    /**
     * This method checks user input against program MAX and MIN value
     *
     * @param min program MIN value
     * @param max program MAX value
     * @return User input if correct values.
     */
    public double getVal(double min, double max) {
        System.out.println("Ange ett tal mellan " + min + " och " + max);
        System.out.print(">");
        double inputValue = 0;

        try {
            inputValue = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Det måste vara ett nummer.");
            input.next();
            return getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        }
        System.out.println(inputValue);
        if (inputValue >= min && inputValue <= max) {
            return inputValue;
        } else {
            System.out.println("Ditt värde är inte inom gränsen");
            return getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        }

    }

    /**
     * @return square root of two user input
     */
    public double sqrtOf() {
        System.out.println("Skriv in ett heltal som du vill ta roten ur.");
        int x = (int) getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double sqrtOf = Math.sqrt(x);
        System.out.printf("Roten ur " + x + " är: %.2f", sqrtOf);
        System.out.println();
        return sqrtOf;

    }

    /**
     * @return user called percentage of user value.
     */
    public double procent() {
        System.out.println("Skriv in ett värde som du vill ta procent av.");
        double total = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        System.out.println("Skriv in procenten.");
        double procent = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double value = total * (procent / 100);
        System.out.println(procent + "% av " + total + " är: " + value);
        return procent;
    }

    /**
     * @return hypotenuse of two user set catheters.
     */
    public double pythagoras() {
        System.out.println("Skriv in en katet.");
        double x = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        System.out.println("Skriv in en till katet.");
        double y = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double pythagoras = Math.hypot(x, y);
        System.out.printf("Hypotenusan av " + x + " och " + y + " är: %.2f", pythagoras);
        System.out.println();
        return pythagoras;
    }

    /**
     * @return area of circle with user input radii.
     */
    public double circleA() {
        System.out.println("Skriv in din cirkels diameter.");
        double x = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double radie = x / 2;
        double circleA = radie * radie * Math.PI;
        System.out.println("Cirkens area är: " + circleA);
        return circleA;
    }

    /**
     * @return adderade tal
     */
    public double addition() {
        System.out.println("Skriv in din första term att addera.");
        double x = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        System.out.println("Skriv in din andra term att addera.");
        double y = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double addition = x + y;
        System.out.println("Summan av " + x + " och " + y + " är: " + addition);
        return addition;
    }

    /**
     * @return subtraherade av tal
     */
    public double subtraktion() {
        System.out.println("Skriv in din första term att subtrahera ifrån.");
        double x = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        System.out.println("Skriv in din andra term att subtrahera från " + x);
        double y = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double subtraktion = x - y;
        System.out.println("Differensen av " + x + " och " + y + " är: " + subtraktion);
        return subtraktion;
    }
}