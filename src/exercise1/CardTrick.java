package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author sehajpreet kaur
 * @author Sehajpreet kaur 30 may,2023
 */

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
          double rand=Math.random();
            //       Don't worry about duplicates at this point
        }

       Scanner input=new Scanner(System.in);
       System.out.println("enter any card number");
       double ans=input.nextInt();
       
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
     
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Sehajpreet kaur 30 may,2023
     */
    //I M DONE!!!!
    private static void printInfo() {
        //COMMENT
        System.out.println("I AM DONE");
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is SEHAJ, but you can call me prof, SEHAJ or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Listening music");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
        System.out.println("I am Sehajpreet Kaur.I am from India and here I am living in Etobicoke.This is my second "
                + "semester and i came here after completing my high school");
        
    
    }

}
