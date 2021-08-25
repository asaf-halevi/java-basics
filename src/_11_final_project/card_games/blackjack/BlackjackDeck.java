package _11_final_project.card_games.blackjack;

import _11_final_project.card_games.Deck;

public class BlackjackDeck extends Deck {

    @Override
    protected BlackjackCard createCard(String suit, String rank) {
        return new BlackjackCard(suit, rank);
    }

    @Override
    public BlackjackCard getTopCard() {
        return (BlackjackCard) super.getTopCard();
    }
}
