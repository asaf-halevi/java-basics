package _10_blackjack;

public class Card {
    public static final String[] SUITS = {"Spade", "Club", "Heart", "Diamond"};
    public static final String ACE = "Ace";
    public static final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", ACE};
    private static final int LENGTH_OF_ACE = ACE.length();
    private static final int VALUE_OF_ROYALTY = 10;
    private static final int VALUE_OF_ACE = 11;

    private final String suit;
    private final String rank;
    private int value;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        calculateValueByRank();
    }

    private void calculateValueByRank() {
        if (rank.length() < LENGTH_OF_ACE) {
            value = Integer.parseInt(rank);
        } else if (rank.length() > LENGTH_OF_ACE) {
            value = VALUE_OF_ROYALTY;
        } else {
            value = VALUE_OF_ACE;
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public boolean isAce() {
        return rank.equals(ACE);
    }
}
