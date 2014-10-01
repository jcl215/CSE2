/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Burger King
//
//Compile then run the program BurgerKing.java
//
import java.util.Scanner; //Scanner class import
//
// define a class
public class BurgerKing {
    
//add main method
    public static void main(String[] args) {
            Scanner myScanner; //Scanner must be uploaded
            myScanner = new Scanner( System.in );
             
            System.out.println("Enter a letter yo indicate a choice of");
            System.out.println("\tBurger (B or b)");
            System.out.println("\tSoda (S or s)");
            System.out.print("\tFries (F or f)\t");
            
            String uInput = myScanner.next(); //take user input
            
            if (uInput.length() == 1){
                  
                switch(uInput){ //switch based on user input
                //burger case
                    case "b":
                    case "B":
                        System.out.println("Enter: A or a for 'all the fixins'");
                        System.out.println("       C or c for cheese");
                        System.out.print("       N or n for none of the above\t");
                        String fixins = myScanner.next();
                        switch(fixins){
                            case "A":
                            case "a":
                                System.out.println("You ordered a burger with everything");
                            break;
                            
                            case "C":
                            case "c":
                                System.out.println("You ordered a burger with cheese");
                            break;
                            
                            case "N":
                            case "n":
                                System.out.println("You ordered a burger with no extras");
                            break;
                            
                            default:
                                System.out.println("You made an invalid choice! I am kicking you out!");
                            break;
                        }
                    break;
                    //soda case
                    case "s":
                    case "S":
                        System.out.println("Enter: P or P for Pepsi");
                        System.out.println("       C or c for Coke");
                        System.out.println("       S or s for Sprite");
                        System.out.print("       M or m for Mountain Dew\t");
                        String sodas = myScanner.next();
                        switch(sodas){
                            case "P":
                            case "p":
                                System.out.println("You ordered a Pepsi");
                            break;
                            
                            case "C":
                            case "c":
                                System.out.println("You ordered a Coke");
                            break;
                            
                            case "S":
                            case "s":
                                System.out.println("You ordered a Sprite");
                            break;
                            
                            case "M":
                            case "m":
                                System.out.println("You ordered a Mountain Dew");
                            break;
                            default:
                                System.out.println("You made an invalid choice! I am kicking you out!");
                            break;
                        }
                    break;

                     //fries case
                    case "f":
                    case "F":
                        System.out.print("Enter L or l for large, or S or s for small\t");
                        String fries = myScanner.next();
                        switch(fries){
                            case "L":
                            case "l":
                                System.out.println("You ordered a large fries");
                            break;
                            
                            case "S":
                            case "s":
                                System.out.println("You ordered a small fries");
                            break;
                            default:
                                System.out.println("You made an invalid choice! I am kicking you out!");
                            break;
                        }
                    break;

                    //if none of the above
                    default:
                                System.out.println("You made an invalid choice! I am kicking you out!");
                    break;
                }
                System.out.println("Thank you for coming to Burger King, we hope to see you again!");
            }
            else {
                System.out.println("Invalid input, aborting!!!");
            }
}

}