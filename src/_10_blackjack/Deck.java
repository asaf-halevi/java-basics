package _10_blackjack;

import java.util.Arrays;

public class Deck {
    protected static final int DECK_SIZE = 52;
    private static final int NUM_OF_SWAPS = 1000;

    private final BlackjackCard[] cards;
    private int topCardIndex;

    public Deck() {
        cards = new BlackjackCard[DECK_SIZE];
        initiateDeck();
        shuffle();
    }

    private void initiateDeck() {
        int cardIndex = 0;
        for (int suit = 0; suit < BlackjackCard.SUITS.length; suit++) {
            for (int rank = 0; rank < BlackjackCard.RANK.length; rank++) {
                cards[cardIndex] = new BlackjackCard(BlackjackCard.SUITS[suit], BlackjackCard.RANK[rank]);
                cardIndex++;
            }
        }
    }

    public void shuffle() {
        topCardIndex = 0;
        BlackjackCard temp;
        for (int swap = 0; swap < NUM_OF_SWAPS; swap++) {
            int randomPlaceInDeck = (int) (Math.round(Math.random() * (DECK_SIZE - 1)));
            temp = cards[0];
            cards[0] = cards[randomPlaceInDeck];
            cards[randomPlaceInDeck] = temp;
        }
    }

    public BlackjackCard getTopCard() {
        if (topCardIndex == DECK_SIZE) {
            throw new IllegalStateException("No more cards in deck");
        }
        return cards[topCardIndex++];
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
