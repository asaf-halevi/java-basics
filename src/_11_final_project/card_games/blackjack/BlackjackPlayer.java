package _11_final_project.card_games.blackjack;

import _11_final_project.card_games.CardPlayer;

public class BlackjackPlayer extends CardPlayer {

    private int cardsTotalValue;

    public BlackjackPlayer(int maxCardsInHand, int money) {
        super(maxCardsInHand, money);
        cardsTotalValue = 0;
    }

    public BlackjackPlayer(int maxCardsInHand) {
        this(maxCardsInHand, 0);
    }

    public void dealCard(BlackjackCard card) {
        super.dealCard(card);
        updateCardsTotalValue();
    }

    private void updateCardsTotalValue() {
        cardsTotalValue = 0;
        int numberOfAces = 0;
        for (int i = 0; i < getCardIndex(); i++) {
            cardsTotalValue += ((BlackjackCard) getCard(i)).getValue();
            if (getCard(i).isAce()) {
                numberOfAces++;
            }
        }

        while (cardsTotalValue > Blackjack.BEST_SCORE && numberOfAces > 0) {
            cardsTotalValue -= 10;
            numberOfAces--;
        }
    }

    public int getCardsTotalValue() {
        return cardsTotalValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        BlackjackPlayer that = (BlackjackPlayer) o;
        return cardsTotalValue == that.cardsTotalValue;
    }

    @Override
    public String toString() {
        return "BlackJackPlayer{" +
                "cardsTotalValue=" + cardsTotalValue +
                "} " + super.toString();
    }
}
