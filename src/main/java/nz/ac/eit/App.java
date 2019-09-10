package nz.ac.eit;

import java.util.Scanner;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int number;
        String language;
        Converter converter = new Converter();
        String convertedNumber;

        System.out.print( "***\nWhat is the number to translate?\n***\n" );
        number = Integer.parseInt(sc.nextLine());

        System.out.print("***\nWhat is the language you would like to translate into?\n(ENG, GER, FRA, ITA, ESP)\n***\n");
        language = sc.nextLine().toUpperCase();
        while (!(language.equals("ENG") || language.equals("GER") || language.equals("FRA") || language.equals("ITA") || language.equals("ESP"))) {
            System.out.println("That language is not currently supported. Please enter another:");
            language = sc.nextLine().toUpperCase();
        }

        convertedNumber = converter.convert(number, language);
        if (!convertedNumber.equals("Error")) {
            System.out.print("***\n" + number + " in " + language + " is " + convertedNumber + "\n***\n");
        } else {
            System.out.print("***\n" + "Sorry, an unexpected error occurred\n***\n");
        }
    }



}
