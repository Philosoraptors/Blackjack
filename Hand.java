/**
 * Hand.java
 */

import java.util.*;

public class Hand {
    ArrayList<Card> cards;
    int score = 0;
    int aceCount = 0;
    String cardStr = "";
    String player = "";
    
    public Hand() {
	    cards = new ArrayList<Card>();
    }
    
    public void addCard(Card c) {
	    cards.add(c);
    }
    
    //In order to get the score this method accounts for the fact that aces can be 1 or 11
    public int getScore() {
	    for (Card c : cards){
        score += c.cardVal();
        if (c.cardVal() == 1){
          score += 10;
          aceCount++;
        }
        if (score > 21){
          while (aceCount > 0){
            score -= 10;
            aceCount--; 
          }
        } 
      }
	    return score;
  }  
    //returns a list of cards the player holds
    public String toString() {
      for (Card c : cards){
        cardStr = cardStr + c.toString() + "\n";
      }
      return cardStr;
    }
    
    public String getPlayer() {
      return player;
    }

    public void setPlayer(String a) {
      player = a;
    }
    
}

