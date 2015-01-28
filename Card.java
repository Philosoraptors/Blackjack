/**
 * Card.java
 */
import java.util.*;

public class Card {

  public static final String[] SUITS = {
    "clubs",
    "spades",
    "hearts",
    "diamonds"
  };

  public static final String[] VALUES = {
    "Ace",
    "Two",
    "Three",
    "Four",
    "Five",
    "Six",
    "Seven",
    "Eight",
    "Nine",
    "Ten",
    "Jack",
    "Queen",
    "King"
  };
  
  public String suiteStr;
  public String cardStr;
  public String id;
  public int index;
  public int val;
  public int suite;  

  public Card (int a){
    
  index = a;
  val = ((int)index / 4) + 1;
  suite = index % 4;
  suiteStr = SUITS[suite];
  cardStr = VALUES[val-1];
  id = cardStr + " of " + suiteStr;

  }

  public int cardVal() {
    return val;
  }

  public String cardId () {
    return id;
  }

  public String cardSuite () {
    return suiteStr;
  }

  public String cardName () {
    return cardStr;
  }
  
}
