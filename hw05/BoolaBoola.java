/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Boola Boola
//
//Compile then run the program BurgerKing.java
//
import java.util.Random;
import java.util.Scanner; //Scanner class import
//
// define a class
public class BoolaBoola {
    
//add main method
    public static void main(String[] args) {
            int ans; //holds the boolean result
            int uAns; //holds the user's answer
            Scanner myScanner; //Scanner must be uploaded
            myScanner = new Scanner( System.in );
            
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(32) + 1;

            switch(1) {
                case 1:
                    System.out.print("Does false || false && false have the value true(t/T) or false(f/F)?\t"); //prompt question
                    if (false || false && false) //calculate result
                        ans = 1;
                    else
                        ans = 0;
                        
                    String uInput = myScanner.next();
                    System.out.println(uInput); //take user imput
                    if ((uInput == "t") || (uInput == "T")) { //I got stuck here because I was not able to compare string input?
                    System.out.print("here"); //was testing... didn't work
                        uAns = 1;
                    }
                    else if (uInput == "f" || uInput == "F") //check if false was entered by user
                        uAns = 0;
                    else {
                        System.out.println("Invalid input, exiting!");
                        break;
                    }
                     
                    if (uAns == ans) //compare user result to actual result
                        System.out.println("Correct!");
                    else
                        System.out.println("Incorrect...");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:

                default:
                    System.out.println("An error occured - please run again!");
                    break;
            }
    }
}