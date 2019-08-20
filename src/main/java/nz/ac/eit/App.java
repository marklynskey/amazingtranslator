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
    }
}
