package _11_final_project.card_games.blackjack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import _11_final_project.card_games.Deck;
import org.junit.Test;

public class BlackjackDeckTest {
    @Test
    public void testCreateCard() {
        BlackjackCard actualCreateCardResult = (new BlackjackDeck()).createCard("Suit", "Rank");
        assertEquals("Rank", actualCreateCardResult.getRank());
        assertEquals(10, actualCreateCardResult.getValue());
        assertEquals("Suit", actualCreateCardResult.getSuit());
    }

    @Test
    public void testCreateCard2() {
        BlackjackCard actualCreateCardResult = (new BlackjackDeck()).createCard("Suit", "42");
        assertEquals("42", actualCreateCardResult.getRank());
        assertEquals(42, actualCreateCardResult.getValue());
        assertEquals("Suit", actualCreateCardResult.getSuit());
    }

    @Test
    public void testCreateCard3() {
        BlackjackCard actualCreateCardResult = (new BlackjackDeck()).createCard("42", "42");
        assertEquals("42", actualCreateCardResult.getRank());
        assertEquals(42, actualCreateCardResult.getValue());
        assertEquals("42", actualCreateCardResult.getSuit());
    }

    @Test
    public void testGetTopCard() {
        assertNotNull((new BlackjackDeck()).getTopCard());
    }
}

