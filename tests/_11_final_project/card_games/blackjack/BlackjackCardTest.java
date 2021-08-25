package _11_final_project.card_games.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackjackCardTest {
    @Test
    public void testConstructor() {
        BlackjackCard actualBlackjackCard = new BlackjackCard("Suit", "Rank");

        assertEquals(10, actualBlackjackCard.getValue());
        assertEquals("[Rank of Suit]", actualBlackjackCard.toString());
    }

    @Test
    public void testConstructor2() {
        BlackjackCard actualBlackjackCard = new BlackjackCard("Suit", "Rank");

        assertEquals("Rank", actualBlackjackCard.getRank());
        assertEquals(10, actualBlackjackCard.getValue());
        assertEquals("Suit", actualBlackjackCard.getSuit());
    }

    @Test
    public void testConstructor3() {
        BlackjackCard actualBlackjackCard = new BlackjackCard("Suit", "Ace");

        assertEquals("Ace", actualBlackjackCard.getRank());
        assertEquals(11, actualBlackjackCard.getValue());
        assertEquals("Suit", actualBlackjackCard.getSuit());
    }

    @Test
    public void testConstructor4() {
        BlackjackCard actualBlackjackCard = new BlackjackCard("Suit", "42");

        assertEquals("42", actualBlackjackCard.getRank());
        assertEquals(42, actualBlackjackCard.getValue());
        assertEquals("Suit", actualBlackjackCard.getSuit());
    }

    @Test
    public void testConstructor5() {
        BlackjackCard actualBlackjackCard = new BlackjackCard("Ace", "Ace");

        assertEquals("Ace", actualBlackjackCard.getRank());
        assertEquals(11, actualBlackjackCard.getValue());
        assertEquals("Ace", actualBlackjackCard.getSuit());
    }
}

