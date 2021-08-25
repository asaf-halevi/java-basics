package _11_final_project.card_games;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testConstructor2() {
        assertNotNull((new Deck()).getTopCard());
    }

    @Test
    public void testCreateCard() {
        Card actualCreateCardResult = (new Deck()).createCard("Suit", "Rank");
        assertEquals("Rank", actualCreateCardResult.getRank());
        assertEquals("Suit", actualCreateCardResult.getSuit());
    }

    @Test
    public void testShuffle() {
        Deck deck = new Deck();
        String deckAsTextBefore = deck.toString();
        deck.shuffle();
        String deckAsTextAfter = deck.toString();
        assertNotEquals(deckAsTextBefore, deckAsTextAfter);
    }

    @Test
    public void testGetTopCard() {
        assertNotNull((new Deck()).getTopCard());
    }
}

