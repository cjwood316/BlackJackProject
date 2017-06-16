package cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	public void createDeck() {

		List<Card> deck = new ArrayList<>(52);

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}
}
