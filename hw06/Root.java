/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Root
//
//Compile then run the program Root.java
//
import java.util.Random;
import java.util.Scanner; //Scanner class import
//
// define a class
public class Root {
    
//add main method
    public static void main(String[] args) {
            Scanner myScanner; //Scanner must be uploaded
            myScanner = new Scanner( System.in );
            System.out.print("Please enter a number to calculate it's square root: ");
            double x = myScanner.nextDouble();
            double middle = 0, low = 0, high = x + 1;
            
            if (x > 0) {
                while((high - low) > (0.00000001*(1+x))) {
                    middle = (high + low) / 2;
                    
                    if ((middle * middle) >= x) {
                        high = middle;
                    }
                    else {
                        low = middle;
                    }
                }
                System.out.printf("The square root is about %.2f for " + x + ".\n", middle);
            }
            else {
                System.out.println("Your number is not greater than zero, program ending...");
            }
    }
}