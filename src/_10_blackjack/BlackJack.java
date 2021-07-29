package _10_blackjack;

import java.util.Scanner;

public class BlackJack {
    public static final int BEST_SCORE = 21;
    public static final int DEALERS_MAX_VALUE_FOR_DRAW = 17;
    private static final int[] VALID_BETS = {1, 5, 10, 50, 100};

    private final Scanner scanner;
    private Deck deck;
    private Player human;
    private Player dealer;

    public BlackJack() {
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
        human.printCurrentSumOfMoney();
        System.out.println("Let the game begin!");
        do {
            int moneyBeforeRound = human.getMoney();
            playRound();
            gamesPlayed++;
            if (human.getMoney() > moneyBeforeRound) {
                gamesWon++;
            }
        } while (human.getMoney() > 0 && askForAnotherRound());
        System.out.println("You have played " + gamesPlayed + " games and won " + gamesWon);
        human.printCurrentSumOfMoney();
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

        if (human.getCardsTotalValue() > BEST_SCORE) {
            humanLostRound(bet);
        } else {
            while (dealer.getCardsTotalValue() <= DEALERS_MAX_VALUE_FOR_DRAW) {
                System.out.println("Dealer draws another card...");
                dealer.dealCard(deck.getTopCard());
                printHand(dealer);
            }
            System.out.println("Dealer stands");
            if (dealer.getCardsTotalValue() > BEST_SCORE) {
                humanWonRound(bet);
            } else {
                if (human.getCardsTotalValue() >= dealer.getCardsTotalValue()) {
                    humanWonRound(bet);
                } else {
                    humanLostRound(bet);
                }
            }
        }
        System.out.println("\n----------------\n");
    }

    private void humanWonRound(int bet) {
        printBothHands();
        System.out.println("You've won this round!");
        human.winMoney(bet);
    }

    private void humanLostRound(int bet) {
        System.out.println("You've lost this round!");
        human.looseMoney(bet);
    }

    private boolean askForAnotherRound() {
        String answer;
        char firstLetter;
        do {
            System.out.print("Would you like another round? (Yes / No)");
            answer = scanner.next();
            firstLetter = Character.toUpperCase(answer.charAt(0));
        } while (firstLetter != 'Y' && firstLetter != 'N');
        return firstLetter == 'Y';
    }

    private int getBet(int money) {
        int bet;
        do {
            System.out.print("Place your bet ( ");
            for (int validBet : VALID_BETS) {
                System.out.print(validBet + " ");
            }
            System.out.print("): ");
            bet = scanner.nextInt();
        } while (!isValidBet(bet));
        return bet;
    }

    private boolean isDrawAnother() {
        String answer;
        char firstLetter;
        do {
            System.out.print("Would you like another card? (Draw / Stand)");
            answer = scanner.next();
            firstLetter = Character.toUpperCase(answer.charAt(0));
        } while (firstLetter != 'D' && firstLetter != 'S');
        return firstLetter == 'D';
    }

    private boolean isValidBet(int bet) {
        boolean isValid = false;
        if (bet <= human.getMoney()) {
            for (int validBet : VALID_BETS) {
                if (validBet == bet) {
                    isValid = true;
                    break;
                }
            }
        }
        if (!isValid) {
            System.out.println("Invalid bet! You currently have " + human.getMoney() + "$");
        }
        return isValid;
    }

    private void printBothHands() {
        System.out.println("End of round results:");
        printHand(human);
        printHand(dealer);
    }

    private void printHand(Player player) {
        System.out.print(player.equals(human) ? "Your " : "Dealer's ");
        player.printHand();
    }
}
