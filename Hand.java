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
    boolean standBool = false;
    
    //PUBLIC METHODS    

    public Hand() {
	    cards = new ArrayList<Card>();
    }
    
    public void addCard(Card c) {
	    cards.add(c);
    }

    public void remCard() {
      cards.remove(0);
    }

    public void setStand() {
      standBool = true;
    }

    public boolean checkStand() {
      return standBool;
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

    //Checks to see whether the score is greater than 21
    public boolean checkLose() {
      if (this.getScore() > 21){
        return true;
      }
      else {
        return false;
      }
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

    //Returns card value of specified card in the arraylist cards
    public int getCardVal(int a) {
      return cards.get(a).cardVal();
    }
    
    //checks to see if hand is made up of only two cards of the same suite
    public boolean checkDouble() {
      if (cards.size() < 3){
    	  if (cards.get(0).cardName().equals(cards.get(1).cardName())){
          return true;
        }
        else{
          return false;
        }
      }
      else{
        return false;
      }
    }

}

