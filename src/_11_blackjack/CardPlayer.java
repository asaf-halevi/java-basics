package _11_blackjack;

import java.util.Arrays;

public class CardPlayer {
    private final int maxCardsInHand;
    private BlackjackCard[] cards;
    private int cardIndex;
    private int money;

    public CardPlayer(int maxCardsInHand) {
        this.maxCardsInHand = maxCardsInHand;
        resetCards();
    }

    public CardPlayer(int maxCardsInHand, int money) {
        this(maxCardsInHand);
        this.money = money;
    }

    public void resetCards() {
        cards = new BlackjackCard[maxCardsInHand];
        cardIndex = 0;
    }

    public void dealCard(BlackjackCard card) {
        cards[cardIndex++] = card;
    }

    public void printHand() {
        System.out.print("cards: ");
        for (int i = 0; i < getCardIndex(); i++) {
            System.out.print(getCard(i));
            if (i < getCardIndex() - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    public void looseMoney(int sum) {
        System.out.println("You've lost " + sum + "$");
        money -= sum;
        printCurrentSumOfMoney();
    }

    public void winMoney(int sum) {
        System.out.println("You've won " + sum + "$");
        money += sum;
        printCurrentSumOfMoney();
    }

    public void printCurrentSumOfMoney() {
        System.out.println("You now have " + money + "$");
    }

    public BlackjackCard getCard(int i) {
        return cards[i];
    }

    public BlackjackCard[] getCards() {
        return cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardPlayer that = (CardPlayer) o;
        return cardIndex == that.cardIndex && money == that.money && Arrays.equals(cards, that.cards);
    }

    @Override
    public String toString() {
        return "CardPlayer{" +
                "cards=" + Arrays.toString(cards) +
                ", cardIndex=" + cardIndex +
                ", money=" + money +
                '}';
    }

    public int getCardIndex() {
        return cardIndex;
    }

    public int getMoney() {
        return money;
    }
}
