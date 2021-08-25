package _11_final_project.card_games;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void testConstructor() {
        Card actualCard = new Card("Suit", "Rank");
        assertEquals("Rank", actualCard.getRank());
        assertEquals("Suit", actualCard.getSuit());
        assertEquals("[Rank of Suit]", actualCard.toString());
    }

    @Test
    public void testIsAce() {
        assertFalse((new Card("Suit", "Rank")).isAce());
        assertTrue((new Card("Suit", Card.ACE)).isAce());
    }
}

