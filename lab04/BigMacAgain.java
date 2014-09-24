//Jessica Lazo Quintana
//09/23/2014
//CSE2
//
//
//
import java.util.Scanner; //Scanner class import
//
// 
//
// defining a class
public class BigMacAgain{
// main method required for all Java programs
public static void main(String[] args) {
     Scanner myScanner; //Scanner must be loaded in for program to recognize
            myScanner = new Scanner( System.in );
             System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
             int nBigMacs = myScanner.nextInt();
              System.out.print("Enter the cost per Big Mac as"+
             "a double (in the form xx.xx): " );
             if(myScanner.hasNextInt())
                Enter the number of Big Macs: 5
                You ordered 5 Big Macs for a cost of 5x2.22 = $11.1
                Do you want an order of fries (Y/y/N/n)? 'y'
                You did not enter one of 'y', 'Y', 'N', 'n'
                
                Enter the number of Big Macs: -4
                You did not enter an int 5 > 0
                
                Enter the number of Big Macs: int 5
                You did not enter an int
else{
    Enter the number of Big Macs: 5
    You ordered 5 Big Macs for a cost of 5x2.22 = $11.1;
    Do you want an order of fries (Y/y/N/n)? 'y';
    You ordered fries at a cost of $2.15;
    The total cost of the meal is $13.25;

Enter the number of Big Macs: 5
You ordered 5 Big Macs for a cost of 5x2.22 = $11.1;

Do you want an order of fries (Y/y/N/n)? 'N'
The total cost of the meal is $11.1
  System.out.println("You did not enter an int");
  return;    //leaves the program 
}
    
Enter the number of Big Macs: 5
You ordered 5 Big Macs for a cost of 5x2.22 = $11.1
Do you want an order of fries (Y/y/N/n)? 'y'
You did not enter one of 'y', 'Y', 'N', 'n'

Enter the number of Big Macs: -4
You did not enter an int 5 > 0

Enter the number of Big Macs: int 5
You did not enter an int

Enter the number of Big Macs: 5
You ordered 5 Big Macs for a cost of 5x2.22 = $11.1;
Do you want an order of fries (Y/y/N/n)? 'y';
You ordered fries at a cost of $2.15;
The total cost of the meal is $13.25;

Enter the number of Big Macs: 5
You ordered 5 Big Macs for a cost of 5x2.22 = $11.1;

Do you want an order of fries (Y/y/N/n)? 'N'
The total cost of the meal is $11.1
}  //end of main method   
  	} //end of class