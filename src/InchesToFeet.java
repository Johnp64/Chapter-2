import java.util.Scanner;

public class InchesToFeet
{
    public static void main(String[] args)
    {
        int inches;
        int feet;
        int remaining;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of inches >>> ");
        inches = keyboard.nextInt();

        feet = inches/12;
        remaining = inches%12;

        System.out.println(inches + " inches equals " + feet + " feet " + "and " + remaining + " inches.");

    }

}