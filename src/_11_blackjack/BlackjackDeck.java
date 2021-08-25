package _11_blackjack;

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
