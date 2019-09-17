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
        // Create required objects
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String language = "";
        InputChecker checker = new InputChecker();
        Converter converter = new Converter();
        String convertedNumber;

        // Get the number to translate
        System.out.print("***\nWhat is the number you'd like to translate?\n***\n");
        Boolean validNumber = false;
        while (!validNumber) {
            System.out.println("Enter number:");
            try {
                number = checker.checkNumber(sc.nextLine());
                validNumber = true;
            } catch (Exception e) {
                System.out.println("Sorry, that's not a valid number.");
            }
        }

        // Get the language to translate into
        System.out.print("***\nWhat is the language you would like to translate into?\n(ENG, GER, FRA, ITA, ESP)\n***\n");
        Boolean languageSupported = false;
        while (!languageSupported) {
            System.out.println("Enter language:");
            try {
                language = checker.checkLanguage(sc.nextLine());
                languageSupported = true;
            } catch (Exception e) {
                System.out.println("Language not supported");
            }
        }

        // Convert the number and output to console
        convertedNumber = converter.convert(number, language);
        if (!convertedNumber.equals("Error")) {
            System.out.print("***\n" + number + " in " + language + " is " + convertedNumber + "\n***\n");
        } else {
            System.out.print("***\n" + "Sorry, an unexpected error occurred\n***\n");
        }
    }
    
}
