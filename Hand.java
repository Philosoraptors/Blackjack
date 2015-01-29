/**
 * Hand.java
 */

import java.util.*;

public class Hand {
    ArrayList<Card> cards;
    int score = 0;
    int aceCount = 0;
    
    public Hand() {
	cards = new ArrayList<Card>();
    }
    
    public void addCard(Card c) {
	    cards.add(c);
    }
    
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
}

