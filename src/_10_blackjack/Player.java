package _10_blackjack;

public class Player {
    private static final int INITIAL_SUM_OF_MONEY = 1000;

    private Card[] cards;
    private int cardIndex;
    private int cardsTotalValue;
    private int money;

    public Player(){
        money = INITIAL_SUM_OF_MONEY;
        resetCards();
    }

    public void resetCards() {
        cards = new Card[Deck.DECK_SIZE / 2];
        cardIndex = 0;
        cardsTotalValue = 0;
    }

    public void dealCard(Card card){
        cards[cardIndex++] = card;
        updateTotalValue();
    }

    private void updateTotalValue() {
        int numberOfAces = 0;
        for (int i=0; i < cardIndex; i++){
            cardsTotalValue += cards[i].getValue();
            if (cards[i].isAce()){
                numberOfAces++;
            }
        }

        while (cardsTotalValue > BlackJack.BEST_SCORE && numberOfAces > 0){
            cardsTotalValue -= 10;
            numberOfAces--;
        }
    }

    public void printHand() {
        System.out.print("Cards in hand: ");
        for (int i=0; i < cardIndex; i++){
            System.out.print(cards[i]);
            if (i < cardIndex - 1){
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    public Card[] getCards() {
        return cards;
    }

    public int getCardsTotalValue() {
        return cardsTotalValue;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void looseMoney(int bet) {
        System.out.println("You've lost " + bet + "$");
        money -= bet;
    }

    public void winMoney(int bet) {
        bet *=2;
        System.out.println("You've won " + bet + "$");
        money += bet;
    }
}
