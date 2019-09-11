import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        String color;
        String WordEst;
        String bodyPart;
        String animal;
        String noun;
        String pluralNoun;
        int a;
        int b;
        int c;


        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a color >>> ");
        color = input.nextLine();
        System.out.print(" Enter a Word ending in EST >>> ");
        WordEst = input.nextLine();
        System.out.print(" Enter a plural body part >>> ");
        bodyPart = input.nextLine();
        System.out.print(" Enter a animal >>> ");
        animal = input.nextLine();
        System.out.print(" Enter a noun >>> ");
        noun = input.nextLine();
        System.out.print(" Enter a plural noun >>> ");
        pluralNoun = input.nextLine();
        System.out.print(" Enter a number >>> ");
        a = input.nextInt();
        System.out.print(" Enter a number larger than the first >>> ");
        b = input.nextInt();


        c = a % b;
        System.out.println(" The " + color + " Dragon is the " + WordEst + " Dragon of all. ");
        System.out.println(" It has " + c + bodyPart + " , and a " + animal + " shaped like " + noun
                + ". It loves to eat " + pluralNoun + ", although it will feast on nearly anything ");

    }

}
