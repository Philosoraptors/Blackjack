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


  private int id;
  private int val;
  private int suite;  

  public int CardVal(int i) {
    val = ((int)i / 4) + 1;
    return val;
    }

  public String CardId (int i) {
    val = ((int)i / 4) + 1;
    suite = i % 4;
    return (VALUES[val-1] + " of " + SUITS[suite]);
  }

  public String CardSuite (int i) {
    suite = i % 4;
    return (SUITS[suite]);
  }

  public String CardNumStr (int i) {
    val = ((int)i / 4) + 1;
    return (VALUES[val-1]);
  }
  
}
