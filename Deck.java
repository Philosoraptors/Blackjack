/**
 * Deck.java
 */

import java.util.*;

public class Deck {

  Card[] cards;

  public Deck() {
    cards = new Card[52];

    for (int i = 0; i < 52; i++) {
      cards[i] = new Card(i);
    }
  }

  public void shuffle() {
    // Implementing Fisher–Yates shuffle    Random rnd = new Random();
    for (int i = cards.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }

}
