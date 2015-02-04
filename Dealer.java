/**
 * Dealer.java
 */

import java.io.*;
import java.util.*;

public class Dealer {
  private static Deck deck;
  private static ArrayList<Hand> players;
  private static Hand dealer;
    
  public static void main(String[] args) {
    
    
    
    // Create deck
    deck = new Deck();
    deck.shuffle();

    // Set up input
    Scanner scan = new Scanner(System.in);

    // Ask about players
    System.out.print("How many people are playing? ");
    int playnum = scan.nextInt();
    System.out.println();

    // Create hands
    dealer = new Hand();
    players = new ArrayList<Hand>();
    for (int i = 0; i < playnum; i++) {
	    players.add(new Hand());
      System.out.print("Player " + (i+1) + ", what is your name? ");
      String name = scan.next();
      players.get(i).setPlayer(name);
    }   
   
    // Deal hands
    for (Hand p : players){
      p.addCard(deck.drawCard());
      p.addCard(deck.drawCard());
    }

    dealer.addCard(deck.drawCard());
    dealer.addCard(deck.drawCard());

    // Check if players have doubles and if they want to split their hand
    for (Hand p : players){
      if (p.checkDouble()){
        System.out.println(p.getPlayer() + ", you have doubles. Your cards are: " + p.toString() + "\nWould you like to split your deck? [y/n] \n");
        String splitChoice = scan.next();
        int card1 = p.getCardVal(0);
        if (splitChoice == "y"){
          p.remCard();
          players.add(new Hand());
          players.get(players.size()-1).setPlayer(p.getPlayer());
          players.get(players.size()-1).addCard(deck.drawCard());
          p.addCard(deck.drawCard());
        }
      }
    }

    // Main game loop
    boolean done = false;
    while (!done) {
      showTable();

      // Go through player turns
      for (Hand p : players) {
        if (!p.checkStand() && p.getScore() < 21) {
          System.out.print(p.getPlayer() + ", your score is " + p.getScore() + ". Would you like to hit or stand? ");
          
          // Check input
          String input = scan.next().toLowerCase();

          if (input.equals("hit") || input.equals("h")) {
            Card c = deck.drawCard();
            System.out.println("You drew: " + c.toString());
            p.addCard(c);

            if (p.getScore() > 21) System.out.println("Bust!");
          }

          if (input.equals("stand") || input.equals("s")) {
            p.setStand();
          }
        }
      }

      // Dealer turn
      if (dealer.getScore() < 17) {
        Card c = deck.drawCard();
        System.out.println("Dealer hits: " + c.toString());
        dealer.addCard(c);

        if (dealer.getScore() > 21) {
          System.out.println("Dealer busts!");
        }
      } else {
        System.out.println("Dealer stands");
        dealer.setStand();
      }
      
      // Check endgame conditions
      done = true;
      for (Hand p : players) {
        if (!p.checkStand() && p.getScore() < 21) done = false;
        if (!dealer.checkStand()) done = false;
      }
    }

    int highestScore = 0;
    for (Hand p : players){
      if ((p.getScore() > highestScore) && (p.getScore() <= 21)){
        highestScore = p.getScore();
      }
    }
    for (Hand p : players){
      if (p.getScore() == highestScore){
        System.out.println("Player " + p.getPlayer() + ", you win the round. \n");
      }
    }
  }

  public static void showTable() {
    for (Hand p : players) {
      System.out.println(p.getPlayer() + " has: \n" + p.toString());
    }
    System.out.println("The dealer has: \n" + dealer.toString());
  }
}
