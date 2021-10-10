import java.util.Scanner;

public class Calculator {

    //Colour if you want to add some sparkles to your strings
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";


    final private double MAX_INPUT_VALUE = 1000;
    final private double MIN_INPUT_VALUE = -1000;

    Scanner input;

    public Calculator() {
        input = new Scanner(System.in);
    }

    //Menyfunktion
    public void printMenu() {
        System.out.println("Välj mellan 1-7 för att utföra en av nedan matematiska funktioner:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraktion");
        System.out.println("3) Roten ur");
        System.out.println("4) Procent");
        System.out.println("5) Pythagoras sats");
        System.out.println("6) Area av en cirkel");
        System.out.println("7) Area av en hexagon");
        System.out.println("8) Avsluta");
        System.out.print(">");
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
        double inputValue;

        try {
            inputValue = input.nextDouble();
        } catch (Exception e) {
            System.out.println(TEXT_RED + "Det måste vara ett nummer." + TEXT_RESET);
            input.next();
            return getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        }
        //System.out.println(inputValue);
        if (inputValue >= min && inputValue <= max) {
            return inputValue;
        } else {
            System.out.println(TEXT_RED + "Ditt värde är inte inom gränsen" + TEXT_RESET);
            return getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        }

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
        System.out.println(TEXT_CYAN + "Summan av " + x + " och " + y + " är: " + addition);
        System.out.println();
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
        System.out.println(TEXT_CYAN + "Differensen av " + x + " och " + y + " är: " + subtraktion);
        System.out.println();
        return subtraktion;
    }

    /**
     * @return square root of two user input
     */
    public double sqrtOf() {
        System.out.println("Skriv in ett heltal som du vill ta roten ur.");
        int x = (int) getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double sqrtOf = Math.sqrt(x);
        System.out.printf(TEXT_CYAN + "Roten ur " + x + " är: %.2f", sqrtOf);
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
        System.out.println(TEXT_CYAN + procent + "% av " + total + " är: " + value);
        System.out.println();
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
        System.out.printf(TEXT_CYAN + "Hypotenusan av " + x + " och " + y + " är: %.2f", pythagoras);
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
        System.out.println(TEXT_CYAN + "Cirkelns area är: " + circleA);
        System.out.println();
        return circleA;
    }

    /**
     * @return area of a hexagon with user input hexagon side.
     */
    public double hexagonA(){
        System.out.println("Skriv in sidan av din hexagon.");
        double x = getVal(MIN_INPUT_VALUE, MAX_INPUT_VALUE);
        double hexagonA = (6 * Math.pow(x, 2) / (4*Math.tan(Math.PI/6)));
        System.out.printf(TEXT_CYAN + "Arean av din hexagon är: " + "%.2f", hexagonA);
        System.out.println();
        return hexagonA;
    }

}