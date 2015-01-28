public class Dealer {

	public static void main(String[] args) {
		// Create deck
		Deck deck = new Deck();
		deck.shuffle();

		// Print deck
		for (int i = 0; i < 52; i++) {
			System.out.println(deck.drawCard().getID());
		}
	}
}
