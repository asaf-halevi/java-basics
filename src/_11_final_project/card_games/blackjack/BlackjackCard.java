package _11_final_project.card_games.blackjack;

import _11_final_project.card_games.Card;

public class BlackjackCard extends Card {
    private static final int LENGTH_OF_ACE = ACE.length();
    private static final int VALUE_OF_ROYALTY = 10;
    private static final int VALUE_OF_ACE = 11;

    private int value;

    public BlackjackCard(String suit, String rank) {
        super(suit, rank);
        calculateValueByRank();
    }

    private void calculateValueByRank() {
        if (getRank().length() < LENGTH_OF_ACE) {
            value = Integer.parseInt(getRank());
        } else if (getRank().length() > LENGTH_OF_ACE) {
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
        return super.toString();
    }
}
