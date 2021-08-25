package _11_final_project.card_games.blackjack;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class BlackjackPlayerTest {
    @Test
    public void testConstructor() {
        BlackjackPlayer actualBlackjackPlayer = new BlackjackPlayer(3);
        assertEquals(0, actualBlackjackPlayer.getCardsTotalValue());
        assertEquals("BlackJackPlayer{cardsTotalValue=0} CardPlayer{cards=[null, null, null], cardIndex=0, money=0}",
                actualBlackjackPlayer.toString());
    }

    @Test
    public void testConstructor2() {
        BlackjackPlayer actualBlackjackPlayer = new BlackjackPlayer(3);
        assertEquals(0, actualBlackjackPlayer.getCardIndex());
        assertEquals(0, actualBlackjackPlayer.getMoney());
        assertEquals(0, actualBlackjackPlayer.getCardsTotalValue());
        assertEquals(3, actualBlackjackPlayer.getCards().length);
    }

    @Test
    public void testConstructor3() {
        BlackjackPlayer actualBlackjackPlayer = new BlackjackPlayer(10);
        assertEquals(0, actualBlackjackPlayer.getCardIndex());
        assertEquals(0, actualBlackjackPlayer.getMoney());
        assertEquals(0, actualBlackjackPlayer.getCardsTotalValue());
        assertEquals(10, actualBlackjackPlayer.getCards().length);
    }

    @Test
    public void testConstructor4() {
        BlackjackPlayer actualBlackjackPlayer = new BlackjackPlayer(3, 1);

        assertEquals(0, actualBlackjackPlayer.getCardIndex());
        assertEquals(1, actualBlackjackPlayer.getMoney());
        assertEquals(0, actualBlackjackPlayer.getCardsTotalValue());
        assertEquals(3, actualBlackjackPlayer.getCards().length);
    }

    @Test
    public void testConstructor5() {
        BlackjackPlayer actualBlackjackPlayer = new BlackjackPlayer(3, 0);

        assertEquals(0, actualBlackjackPlayer.getCardIndex());
        assertEquals(0, actualBlackjackPlayer.getMoney());
        assertEquals(0, actualBlackjackPlayer.getCardsTotalValue());
        assertEquals(3, actualBlackjackPlayer.getCards().length);
    }

    @Test
    public void testDealCard() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(3);
        blackjackPlayer.dealCard(new BlackjackCard("Suit", "Rank"));
        assertEquals(1, blackjackPlayer.getCardIndex());
        assertEquals(10, blackjackPlayer.getCardsTotalValue());
    }

    @Test
    public void testDealCard2() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(1);
        blackjackPlayer.dealCard(new BlackjackCard("Suit", "Rank"));
        assertEquals(1, blackjackPlayer.getCardIndex());
        assertEquals(10, blackjackPlayer.getCardsTotalValue());
    }

    @Test
    public void testDealCard3() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(3);
        blackjackPlayer.dealCard(new BlackjackCard("Suit", "Ace"));
        assertEquals(1, blackjackPlayer.getCardIndex());
        assertEquals(11, blackjackPlayer.getCardsTotalValue());
    }

    @Test
    public void testDealCard4() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(3);
        blackjackPlayer.dealCard(new BlackjackCard("Suit", "42"));
        assertEquals(1, blackjackPlayer.getCardIndex());
        assertEquals(42, blackjackPlayer.getCardsTotalValue());
    }

    @Test
    public void testDealCard5() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(1);
        blackjackPlayer.dealCard(new BlackjackCard("Ace", "Rank"));
        assertEquals(1, blackjackPlayer.getCardIndex());
        assertEquals(10, blackjackPlayer.getCardsTotalValue());
    }

    @Test
    public void testEquals() {
        assertFalse((new BlackjackPlayer(3)).equals(null));
        assertFalse((new BlackjackPlayer(3)).equals("Different type to BlackjackPlayer"));
    }

    @Test
    public void testEquals2() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(3);
        assertTrue(blackjackPlayer.equals(blackjackPlayer));
        int expectedHashCodeResult = blackjackPlayer.hashCode();
        assertEquals(expectedHashCodeResult, blackjackPlayer.hashCode());
    }

    @Test
    public void testEquals3() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(3);
        BlackjackPlayer blackjackPlayer1 = new BlackjackPlayer(3);
        assertTrue(blackjackPlayer.equals(blackjackPlayer1));
        int notExpectedHashCodeResult = blackjackPlayer.hashCode();
        assertFalse(Objects.equals(notExpectedHashCodeResult, blackjackPlayer1.hashCode()));
    }

    @Test
    public void testEquals4() {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(0);
        assertFalse(blackjackPlayer.equals(new BlackjackPlayer(3)));
    }
}

