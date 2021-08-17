package _11_blackjack;

public class Card {
    public static final String[] SUITS = {"Spade", "Club", "Heart", "Diamond"};
    public static final String ACE = "Ace";
    public static final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", ACE};

    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public boolean isAce() {
        return getRank().equals(ACE);
    }

    @Override
    public String toString() {
        return "[" + rank + " of " + suit + "]";
    }
}
