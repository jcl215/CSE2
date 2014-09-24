/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Big Mac java Program
//
//Compile then run the program BigMac.java
//
import java.util.Scanner; //Scanner class import
//
// define a class
public class BigMac {
    
//  add main method
    public static void main(String[] args) {
            Scanner myScanner; //Scanner must be loaded in for program to recognize
            myScanner = new Scanner( System.in );
             System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
             int nBigMacs = myScanner.nextInt();
              System.out.print("Enter the cost per Big Mac as"+
             "a double (in the form xx.xx): " );
            double bigMac$ = myScanner.nextDouble();
        	System.out.print(
            "Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
            taxRate/=100; //the user enters percent of tax 
            double cost$;
            int dollars,   //whole dollar amount of cost 
                  dimes, pennies; //for storing digits
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //You get the whole amount bydropping decimal fraction
            dollars=(int)cost$;
            // % (mod) operator returns the remainder in dimes and pennies
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of " +nBigMacs
             +" BigMacs, at $"+bigMac$ +" per bigMac, with a" + 
             " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
         
    } //end of main method
} //end of class


