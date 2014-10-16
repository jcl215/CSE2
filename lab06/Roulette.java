/////////////////////////////////////////////////////////////
//Jessica Lazo Quintana
//CSE2
//Roulette
//
//Compile then run the program Roulette.java
//
import java.util.Random;
import java.util.Scanner; //Scanner class import
//
// define a class
public class Roulette {
    
//add main method
    public static void main(String[] args) {
        int randint, spinresult, hit = 0, miss = 0, alllost = 0, loss = 0, profit = 0, totalwinnings = 0;
        for(int i = 1; i <= 1000; i++) { //loop for 1000 games
            randint = (int) (Math.random() * 38 + 1); //generate a random number between 1 and 38
            //System.out.println("Your number is: " + randint + " for round " + i + ".");
            hit = 0; //initialize hits to zero for these 100 spins
            miss = 0; //initialize misses to zero for these 100 spins
            for(int j = 0; j < 100; j++) { //spin 100 times
                spinresult = (int) (Math.random() * 38 + 1); //find a random result for the roulette spin
                if (spinresult == randint) { //if the two are equal, the spin was a hit
                    hit += 1;
                    }
                else
                    miss += 1;
                }
            if (hit == 0) //this is when we have no hits so all is lost
                alllost += 1;
            else if (hit >= 3) //this is when we have more than three hits, hence a profit
                profit += 1;
            else //no real reason to track this, I did for double checking
                loss += 1;
            totalwinnings += ((hit * 36) - (hit + miss)); //calculate the total profit / loss by incrementing based on $36 from hits a $1 from every spin
            }
        //display results
        System.out.println("You lost everything " + alllost + " times.");
        System.out.println("You made a profit " + profit + " times.");
        System.out.println("Your total winnings equal $" + totalwinnings + ".");
        }
    }