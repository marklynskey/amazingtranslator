package nz.ac.eit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the number to translate?" );
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("The number to translate is " + num);

        System.out.print("What is the language you would like to translate into?\n(ENG, GER, FRA, ITA, ESP)\n");
        input = sc.nextLine().toUpperCase();
        while (!(input.equals("ENG") || input.equals("GER") || input.equals("FRA") || input.equals("ITA") || input.equals("ESP"))) {
            System.out.println("That language is not currently supported. Please enter another:");
            input = sc.nextLine().toUpperCase();
        }
        System.out.println("The language you have chosen is: " + input);
    }
}
