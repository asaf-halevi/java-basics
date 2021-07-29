package _10_blackjack;

import java.util.Arrays;

public class Deck {
    protected static final int DECK_SIZE = 52;
    private static final int NUM_OF_SWAPS = 1000;

    private Card[] cards;

    public Deck(){
        cards = new Card[DECK_SIZE];
        initiateDeck();
        shuffle();
    }

    private void initiateDeck() {
        int cardIndex = 0;
        for (int suit=0; suit < Card.SUITS.length; suit++){
            for (int rank=0; rank < Card.RANK.length; rank++){
                cards[cardIndex] = new Card(Card.SUITS[suit], Card.RANK[rank]);
                cardIndex++;
            }
        }
    }

    public void shuffle(){
        Card temp;
        for (int swap=0; swap < NUM_OF_SWAPS; swap++){
            int randomPlaceInDeck = (int)(Math.round(Math.random() * (DECK_SIZE - 1)));
            temp = cards[0];
            cards[0] = cards[randomPlaceInDeck];
            cards[randomPlaceInDeck] = temp;
        }
    }

    public Card[] getCards(){
        return cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
