/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Random Games
//
//Compile then run the program RandomGames.java
//
import java.util.Scanner; //Scanner class import
//
// define a class
public class RandomGames {
    
//add main method
    public static void main(String[] args) {
            Scanner myScanner; //Scanner must be uploaded
             myScanner = new Scanner( System.in );
             
             System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- g");
            
  String uInput= myScanner.next();
             
             if (uInput.length() ==1){
                  
              switch(uInput){
               case "R";
               case "r";
                    
                    break;
               case "C";
               case "c":
                
                    break;
               case "P";
               case "p";
                   int suit=(int)(Math.random()*4)+1;
                   int nCard = (int)(Math.random()*13+1);
                   switch (nCard){
                     case 11:;
                       String nCard = "Jack";
                       break;
                     case 12;
                       String nCard = "queen";
                       break;
                       
                      case 13;
                       String nCard = "King";
                       break;
                       
                       case 1;
                       String nCard = "Ace";
                       break;
                       
                     
                
                   }
                
              }
             }