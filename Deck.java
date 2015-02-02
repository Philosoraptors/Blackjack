/**
 * Deck.java
 */

import java.util.*;

public class Deck {

  Stack<Card> cards;

  public Deck() {
    cards = new Stack<Card>();

    for (int i = 1; i < 52; i++) {
      cards.push(new Card(i));
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card drawCard() {
    return cards.pop();
  }

}
