
/**
 * Car salesman invoice.
 *
 * @author (Zaharra Chami)
 * 
 */
import java.util.*;
public class CarSalesman
{
    public static void main (String [] args)
    {
        // tells who did the code
        System.out.println ("Programmer: Zaharra Chami");
        System.out.println ("Lab#:       3, part#1\n");
        
        //create a Scanner 
        Scanner input = new Scanner(System.in);
        
        // define the fixed amounts
        final double SALES_TAX = 0.06;
        final double DESTINATION = 700;
        final double DOCUMENTATION = 200;
        final double PREP = 50;
        
        // prompt user to enter car price
        System.out.print ("Enter the base price of a car: $");
        double basePrice =  input.nextDouble();
        
        // to add a black line 
        System.out.println();
        
        // calcutations
        double license = basePrice * 0.005;
        double tax = basePrice * SALES_TAX;
        double total = basePrice+DESTINATION+DOCUMENTATION+PREP+license+tax;
        
        // invoice printout
        System.out.printf ("Vehicle Base Price......... $ %5.2f\n" , basePrice);
        System.out.printf ("Destination Charge......... $ %5.2f\n" , DESTINATION);
        System.out.printf ("Documentation.............. $ %5.2f\n" , DOCUMENTATION);
        System.out.printf ("Prep....................... $ %5.2f\n" , PREP);
        System.out.printf ("License Plate.............. $ %5.2f\n" , license);
        System.out.printf ("Tax........................ $ %5.2f\n\n" , tax);
        
        System.out.printf ("Total...................... $ %5.2f" , total);
        
        
    }
}
/*
Programmer: Zaharra Chami
Lab#:       3, part#1

Enter the base price of a car: $18375.00

Vehicle Base Price......... $ 18375.00
Destination Charge......... $ 700.00
Documentation.............. $ 200.00
Prep....................... $ 50.00
License Plate.............. $ 91.88
Tax........................ $ 1102.50

Total...................... $ 20519.38
*/