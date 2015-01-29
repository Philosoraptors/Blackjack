/**
 * Dealer.java
 */

import java.io.*;
import java.util.*;

public class Dealer {
    
  public static void main(String[] args) {
    // Create deck
    Deck deck = new Deck();
    deck.shuffle();

    // Set up input
    Scanner scan = new Scanner(System.in);

    // Ask about players
    System.out.println("How many people are playing?");
    int playnum = scan.nextInt();

    // Create hands
    Hand dealer = new Hand();
    ArrayList<Hand> players = new ArrayList<Hand>();
    for (int i = 0; i < playnum; i++) {
	    players.add(new Hand());
      System.out.println("Player " + (i+1) + ", what is your name?");
      String name = scan.next();
      players.get(i).setPlayer(name);
    }   
   
    // Deal hands
    System.out.println("\n" + "You have been dealt: " + "\n");
    for (Hand p : players){
      p.addCard(deck.drawCard());
      p.addCard(deck.drawCard());
      System.out.println("Player " + p.getPlayer() + " has: \n" + p.toString());
      System.out.println("Score: " + p.getScore() + "\n");
    }
  }
}
