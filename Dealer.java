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
    System.out.print("How many people are playing? ");
    int playnum = scan.nextInt();
    System.out.println();

    // Create hands
    Hand dealer = new Hand();
    ArrayList<Hand> players = new ArrayList<Hand>();
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

    // Ask players if they want to hit or stand
    for (Hand p : players){
      while (p.checkStand() == false){      
        System.out.println("\nPlayer " + p.getPlayer() + " has: \n" + p.toString());
        System.out.println("Would you like to hit or stand?");
        String hitOrStand = scan.next();
        if (hitOrStand.equals("hit")){
          p.addCard(deck.drawCard());
          System.out.println("\nPlayer " + p.getPlayer() + " has: \n" + p.toString());
        }
        if (hitOrStand.equals("stand")){
          p.setStand();
          System.out.println("You have chosen to stand. Your score is: " + p.getScore());
          }
        if (p.getScore() > 21){
          System.out.println("I'm sorry, but you have lost. Your score is: " + p.getScore() + ". Good luck next time.");
          //sets the value of standBool to true, so that checkStand() will return true
          p.setStand();
        }
        System.out.println("");
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
}
