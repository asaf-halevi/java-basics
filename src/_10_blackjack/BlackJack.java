package _10_blackjack;

import java.util.Locale;
import java.util.Scanner;

public class BlackJack {
    public static final int BEST_SCORE = 21;
    public static final int DEALERS_MAX_VALUE_FOR_DRAW = 17;
    private static final int[] VALID_BETS = {1, 5, 10, 50, 100};

    private Scanner scanner;
    private Deck deck;
    private Player human;
    private Player dealer;

    public BlackJack(){
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        game.startGame();
    }

    private void startGame() {
        deck = new Deck();
        human = new Player();
        dealer = new Player();
        int gamesPlayed = 0;
        int gamesWon = 0;
        boolean isPlayAnotherRound = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You now have " + human.getMoney() + "$");
        System.out.println("Let the game begin!");
        do {
            int moneyBeforeRound = human.getMoney();
            playRound();
            gamesPlayed++;
            if (human.getMoney() > moneyBeforeRound) {
                gamesWon++;
            }
            isPlayAnotherRound = askForAnotherRound();
        } while (human.getMoney() > 0 && isPlayAnotherRound);
        System.out.println("You have played " + gamesPlayed + " games, and won " + gamesWon);
        System.out.println("You now have " + human.getMoney() + "$");
        this.scanner.close();
    }

    private void playRound() {
        int bet = getBet(human.getMoney());
        deck.shuffle();
        human.resetCards();
        dealer.resetCards();

        human.dealCard(deck.getTopCard());
        human.dealCard(deck.getTopCard());
        dealer.dealCard(deck.getTopCard());
        printHand(dealer);
        printHand(human);
        while (human.getCardsTotalValue() < BEST_SCORE && isDrawAnother()) {
            human.dealCard(deck.getTopCard());
            printHand(human);
        }

        if (human.getCardsTotalValue() > BEST_SCORE){
            humanLostRound(bet);
        } else {
            while (dealer.getCardsTotalValue() < DEALERS_MAX_VALUE_FOR_DRAW){
                dealer.dealCard(deck.getTopCard());
                printHand(dealer);
            }
            if (dealer.getCardsTotalValue() > BEST_SCORE){
                humanWonRound(bet);
            } else {
                if (human.getCardsTotalValue() >= dealer.getCardsTotalValue()){
                    humanWonRound(bet);
                } else {
                    humanLostRound(bet);
                }
            }
        }
    }

    private void humanWonRound(int bet) {
        printHand(human);
        System.out.println("You've won this round!");
        human.winMoney(bet);
    }

    private void humanLostRound(int bet) {
        printHand(human);
        System.out.println("You've lost this round!");
        human.looseMoney(bet);
    }

    private boolean askForAnotherRound() {
        char answer;
        do {
            System.out.print("Would you like another round? (Yes / No)");
            answer = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        } while (answer != 'Y' && answer != 'N');
        return answer  == 'Y';
    }

    private int getBet(int money) {
        int bet;
        do {
            System.out.print("Place your bet ( ");
            for (int validBet : VALID_BETS){
                System.out.print(validBet + " ");
            }
            System.out.print("): ");
            bet = scanner.nextInt();
        } while (!isValidBet(bet));
        return bet;
    }

    private boolean isDrawAnother() {
        char answer;
        do {
            System.out.print("Would you like another card? (Draw / Stand)");
            answer = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        } while (answer != 'D' && answer != 'S');
        return answer  == 'D';
    }

    private boolean isValidBet(int bet) {
        boolean isValid = false;
        for (int i=0; i < VALID_BETS.length && !isValid; i++){
            if (VALID_BETS[i] == bet){
                isValid = true;
            }
        }
        return isValid;
    }

    private void printHand(Player player) {
        System.out.print(player.equals(human) ? "Player's " : "Dealer's");
        player.printHand();
    }
}
