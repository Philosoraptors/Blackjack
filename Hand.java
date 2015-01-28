/**
 * Hand.java
 */

import java.util.*;

public class Hand {
    ArrayList<Card> cards;
    int score = 0;
    
    public Hand() {
	cards = new ArrayList<Card>();
    }
    
    public void addCard(Card c) {
	    cards.add(c);
    }
    
    public int getScore() {
	    for (Card c : cards){
        score += c.cardVal();   
      }
	    return score;
  }  
}

