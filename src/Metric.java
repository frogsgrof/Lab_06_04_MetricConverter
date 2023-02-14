import java.util.Scanner; // import scanner

public class Metric {
    public static void main(String[] args) {


        // declarations:

        double meters = 0;  // input variable
        String trash = ""; // for bad input

        // for conversions later:
        double miles;
        double feet;
        double inches;

        Scanner in = new Scanner(System.in);


        // start input
        System.out.println("Enter a distance in meters to convert it to miles, feet, and inches.");

        // check input
        if (in.hasNextDouble()) {
            meters = in.nextDouble(); // store if double
            in.nextLine(); // clear next line
        } else {
            trash = in.nextLine(); // throw out bad input
            System.out.println("ERROR: number not recognized. Please try again.");
            System.exit(0); // terminate
        }
        // end input


        // calculations:
        miles = meters / 1609.0;
        feet = meters * 3.281;
        inches = meters * 39.37;


        // output:
        System.out.println(meters + " meters is equal to...\n\t" +
                miles + " miles,\n\t" +
                feet + " feet, and\n\t" +
                inches + " inches.");


        // end

    }
}