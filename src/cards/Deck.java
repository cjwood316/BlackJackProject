package cards;

import java.util.ArrayList;
import java.util.Collections;
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

	public void shuffleDeck(List<Card> deck) {
		Collections.shuffle(deck);

	}

	public Card dealCardsFromDeck(List<Card> deck) {
		return deck.remove(0);
		
	}
}
