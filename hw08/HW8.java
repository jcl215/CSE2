/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//HW8
//
//Compile then run the program HW8.java


import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in); //Scanner must be uploaded 
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'"); //Print the input
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //stop after 5 attempts 
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789"); //Pick a number between 0 and 9
	System.out.println("You entered '"+input+"'"); //Print input
  }  
}