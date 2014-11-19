/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Poker Odds
//
//Compile then run the program PokerOdds.java

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
public static void main(String [] arg){
    showHands();
    simulateOdds();
}

public static void showHands(){
    Scanner scan = new Scanner(System.in); //create a scanner
    Random rand = new Random(); //create a randomizer
    String answer;
    int deck[] = new int[52]; //create a deck of 52 cards
    int hand[] = new int[5]; //create your hand
    do {
        for(int i = 0; i < deck.length; i++) {
           deck[i] = i; //initialize each deck card to its value
        }
        for(int i = 0; i < hand.length; i++) {
            hand[i] = 0; //empty your hand
        }
    
        //draw first card*****
        int draw = rand.nextInt((51) + 1); //find a random card to draw out of 52
        hand[0] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last card
        int temp = deck[draw];
        deck[draw] = deck[51];
        deck[51] = temp;
    
        //draw second card*****
        draw = rand.nextInt((50) + 1); //find a random card to draw out of 51
        hand[1] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[50];
        deck[50] = temp;
    
        //draw third card*****
        draw = rand.nextInt((49) + 1); //find a random card to draw out of 50
        hand[2] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[49];
        deck[49] = temp;
    
        //draw fourth card*****
        draw = rand.nextInt((48) + 1); //find a random card to draw out of 49
        hand[3] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[48];
        deck[48] = temp;
    
        //draw fifth card*****
        draw = rand.nextInt((47) + 1); //find a random card to draw out of 48
        hand[4] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[47];
        deck[47] = temp;
    
        String club = "Clubs: "; //create clubs string for output
        String diam = "Diamonds: "; //create clubs string for output
        String heart = "Hearts: "; //create clubs string for output
        String spade = "Spades: "; //create clubs string for output
        
        for(int i = 0; i < hand.length; i++) {
            int suite = hand[i]/13;
            switch(suite) {
                case 0: club += cardTypeString(hand[i]) + " "; break;
                case 1: diam += cardTypeString(hand[i]) + " "; break;
                case 2: heart += cardTypeString(hand[i]) + " "; break;
                case 3: spade += cardTypeString(hand[i]) + " "; break;
            }
        }
    
        System.out.println(club);
        System.out.println(diam);
        System.out.println(heart);
        System.out.println(spade);
        System.out.print("\nGo again? Enter 'y' or 'Y', anything else to quit: "); //prompt user to see if looping is necessary
        answer = scan.next(); //take user looping response
    } while(answer.equals("Y") || answer.equals("y")); //loop if y/Y, otherwise end method
}

public static void simulateOdds(){
    Scanner scan = new Scanner(System.in); //create a scanner
    Random rand = new Random(); //create a randomizer
    int deck[] = new int[52]; //create a deck of 52 cards
    int hand[] = new int[5]; //create your hand
    int duplicates[] = new int[13]; //array to hold duplicates (pair) count
    
    for(int i = 0; i < duplicates.length; i++) {
        duplicates[i] = 0; //set all duplicate (pair) counts to zero
    }
    int noPair = 0; //count for no pairs
    for(int ct = 0; ct < 10000; ct++) {
        for(int i = 0; i < deck.length; i++) {
           deck[i] = i; //initialize each deck card to its value
        }
        for(int i = 0; i < hand.length; i++) {
            hand[i] = 0; //empty your hand
        }
    
        //draw first card*****
        int draw = rand.nextInt((51) + 1); //find a random card to draw out of 52
        hand[0] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last card
        int temp = deck[draw];
        deck[draw] = deck[51];
        deck[51] = temp;
    
        //draw second card*****
        draw = rand.nextInt((50) + 1); //find a random card to draw out of 51
        hand[1] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[50];
        deck[50] = temp;
    
        //draw third card*****
        draw = rand.nextInt((49) + 1); //find a random card to draw out of 50
        hand[2] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[49];
        deck[49] = temp;
    
        //draw fourth card*****
        draw = rand.nextInt((48) + 1); //find a random card to draw out of 49
        hand[3] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[48];
        deck[48] = temp;
    
        //draw fifth card*****
        draw = rand.nextInt((47) + 1); //find a random card to draw out of 48
        hand[4] = deck[draw]; //draw card to deck
        deck[draw] = -1; //card has been set as drawn
    
        //swap the drawn card and the last unused card
        temp = deck[draw];
        deck[draw] = deck[47];
        deck[47] = temp;

        int dup = 0;
        int dupCard = 0; //card that has a pair
        
        for(int i = 0; i < hand.length; i++) {
            for(int j = i + 1; j < hand.length; j++) {
                if((hand[i]%13) == (hand[j]%13)) { //check to see if there is a duplicated card
                    dupCard = hand[i]%13; //stores the card that has a pair
                    dup++;
                }
            }
        }
        
        if(dup == 1) { //sees if there is exactly one pair
            duplicates[dupCard]++; //if so, stores in the duplicates array
        } else {
            noPair++; //increments the counter of no pairs
        }
    }
    
    System.out.println("Rank\tFrequency of exactly one pair"); //header for table
    for(int i = 0; i < 12; i++) { //goes through each rank and prints number of pairs
        System.out.println(cardTypeString(i) + "\t" + duplicates[i]);
    }
    System.out.println("__________________________________________"); //divider for table
    System.out.println("Total not exactly one pair: " + noPair); 
    
  return;      
}

public static String cardTypeString(int card) {
    switch(card%13) { //mod 13 to find rank, return corresponding string
        case 0: return "Ace";
        case 1: return "King";
        case 2: return "Queen";
        case 3: return "Jack";
        case 4: return "10";
        case 5: return "9";
        case 6: return "8";
        case 7: return "7";
        case 8: return "6";
        case 9: return "5";
        case 10: return "4";
        case 11: return "3";
        case 12: return "2";
    }
    return "ERROR";
}
}


/* other scratch work *do not grade*
        int ace = 0, king = 0, queen = 0, jack = 0, ten = 0, nine = 0, two = 0;
        int eight = 0, seven = 0, six = 0, five = 0, four = 0, three = 0;
        for(int i = 0; i < hand.length; i++) {
            int suite = hand[i]%13;
            switch(suite) {
                case 0: ace++;
                case 1: king++;
                case 2: queen++;
                case 3: jack++;
                case 4: ten++;
                case 5: nine++;
                case 6: eight++;
                case 7: seven++;
                case 8: six++;
                case 9: five++;
                case 10: four++;
                case 11: three++;
                case 12: two++;
            }
        }
        
        public static boolean exactlyOneDup(int num[]) {
  int dupCount = 0;
  for(int i = 0; i < num.length; i++) { //compare num[i]
    for(int j = i + 1; j < num.length; j++) { //to following elements in array
      if(num[i] == num[j]) { //check if any are equal
        dupCount++; //if so, increment counter
      }
    }
  }
  if (dupCount == 1) { //if counter is one, there is only one duplicate
    return true; //return true
  }
  return false; //the counter is not one, return false
}
}
*/