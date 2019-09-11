import java.util.Scanner;

public class NauticalMiles {

    public static void main(String[] args){

        final double NM_TO_MILE = 1.150779;
        final double NM_TO_KILO = 1.852;
        double userInputNM;
        double nauticalToMiles;
        double nauticalToKilo;

        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Enter the number nautical miles >>> ");
        userInputNM = keyboard.nextDouble();

        nauticalToMiles = NM_TO_MILE * userInputNM;
        nauticalToKilo = NM_TO_KILO * userInputNM;

        System.out.println(" The number of miles is " + nauticalToMiles + " with " +
                nauticalToKilo + " number of kilos ");

    }

}
