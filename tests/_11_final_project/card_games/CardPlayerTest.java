package _11_final_project.card_games;

import _11_final_project.card_games.blackjack.BlackjackPlayer;

import java.util.Objects;

import org.junit.Rule;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CardPlayerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testConstructor() {
        CardPlayer actualCardPlayer = new CardPlayer(3);
        actualCardPlayer.dealCard(new Card("Suit", "Rank"));
        assertEquals(1, actualCardPlayer.getCardIndex());
        assertEquals(0, actualCardPlayer.getMoney());
        assertEquals("CardPlayer{cards=[[Rank of Suit], null, null], cardIndex=1, money=0}", actualCardPlayer.toString());
    }

    @Test
    public void testConstructor2() {
        CardPlayer actualCardPlayer = new CardPlayer(3);
        assertEquals(0, actualCardPlayer.getCardIndex());
        assertEquals(3, actualCardPlayer.getCards().length);
    }

    @Test
    public void testConstructor3() {
        thrown.expect(NegativeArraySizeException.class);
        new CardPlayer(-1);
    }

    @Test
    public void testConstructor4() {
        CardPlayer actualCardPlayer = new CardPlayer(3, 1);

        assertEquals(0, actualCardPlayer.getCardIndex());
        assertEquals(1, actualCardPlayer.getMoney());
        assertEquals(3, actualCardPlayer.getCards().length);
    }

    @Test
    public void testConstructor5() {
        thrown.expect(NegativeArraySizeException.class);
        new CardPlayer(-1, 1);
    }

    @Test
    public void testResetCards() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.resetCards();
        assertEquals(0, cardPlayer.getCardIndex());
        assertEquals(3, cardPlayer.getCards().length);
    }

    @Test
    public void testPrintHand() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.printHand();
        assertEquals(0, cardPlayer.getCardIndex());
        assertEquals(0, cardPlayer.getMoney());
        assertEquals(3, cardPlayer.getCards().length);
    }

    @Test
    public void testPrintHand2() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.dealCard(new Card("Suit", "Rank"));
        cardPlayer.printHand();
        assertEquals(1, cardPlayer.getCardIndex());
        assertEquals(0, cardPlayer.getMoney());
        assertEquals(3, cardPlayer.getCards().length);
    }

    @Test
    public void testLooseMoney() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.looseMoney(1);
        assertEquals(-1, cardPlayer.getMoney());
    }

    @Test
    public void testWinMoney() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.winMoney(1);
        assertEquals(1, cardPlayer.getMoney());
    }

    @Test
    public void testPrintCurrentSumOfMoney() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.printCurrentSumOfMoney();
        assertEquals(0, cardPlayer.getCardIndex());
        assertEquals(0, cardPlayer.getMoney());
        assertEquals(3, cardPlayer.getCards().length);
    }

    @Test
    public void testGetCard() {
        assertNull((new CardPlayer(3)).getCard(1));
    }

    @Test
    public void testGetCard2() {
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        (new CardPlayer(0)).getCard(1);
    }

    @Test
    public void testEquals() {
        assertFalse((new CardPlayer(3)).equals(null));
        assertNotEquals(new CardPlayer(3), new CardPlayer(1));
    }

    @Test
    public void testEquals2() {
        CardPlayer cardPlayer = new CardPlayer(3);
        assertTrue(cardPlayer.equals(cardPlayer));
        int expectedHashCodeResult = cardPlayer.hashCode();
        assertEquals(expectedHashCodeResult, cardPlayer.hashCode());
    }

    @Test
    public void testEquals3() {
        CardPlayer cardPlayer = new CardPlayer(3);
        CardPlayer cardPlayer1 = new CardPlayer(3);
        assertTrue(cardPlayer.equals(cardPlayer1));
        int notExpectedHashCodeResult = cardPlayer.hashCode();
        assertFalse(Objects.equals(notExpectedHashCodeResult, cardPlayer1.hashCode()));
    }

    @Test
    public void testEquals4() {
        CardPlayer cardPlayer = new CardPlayer(0);
        assertFalse(cardPlayer.equals(new CardPlayer(3)));
    }

    @Test
    public void testEquals5() {
        CardPlayer cardPlayer = new CardPlayer(3, 1);
        assertFalse(cardPlayer.equals(new CardPlayer(3)));
    }

    @Test
    public void testEquals7() {
        CardPlayer cardPlayer = new CardPlayer(3);
        cardPlayer.dealCard(null);
        assertFalse(cardPlayer.equals(new CardPlayer(3)));
    }
}

