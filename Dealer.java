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
    }

	 // Deal hands
  }
}
