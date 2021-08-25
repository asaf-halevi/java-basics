package _11_final_project.card_games.blackjack;

import _11_final_project.card_games.Deck;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Blackjack {
    public static final int BEST_SCORE = 21;
    public static final int DEALERS_MAX_VALUE_FOR_DRAW = 17;
    public static final char QUIT = 'Q';
    public static final char DRAW = 'D';
    public static final char STAND = 'S';
    public static final char NO = 'N';
    public static final char YES = 'Y';
    private static final int INITIAL_SUM_OF_MONEY = 1000;
    private static final int[] VALID_BETS = {1, 5, 10, 50, 100};
    public static final int PAUSE_TIME = 2_100_900_000;
    private final Scanner scanner;
    private BlackjackDeck deck;
    private BlackjackPlayer human;
    private BlackjackPlayer dealer;
    private int gamesPlayed;
    private int gamesWon;

    public Blackjack() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.playBlackjack();
    }

    public void playBlackjack() {
        startGame();
        playAllRounds();
        finishGame();
    }

    private void startGame() {
        deck = new BlackjackDeck();
        human = new BlackjackPlayer((Deck.DECK_SIZE / 2), INITIAL_SUM_OF_MONEY);
        dealer = new BlackjackPlayer((Deck.DECK_SIZE / 2));
        gamesPlayed = 0;
        gamesWon = 0;
        human.printCurrentSumOfMoney();
        System.out.println("Let the game begin!");
    }

    private void playAllRounds() {
        do {
            int moneyBeforeRound = human.getMoney();
            playRound();
            gamesPlayed++;
            if (human.getMoney() > moneyBeforeRound) {
                gamesWon++;
            }
        } while (human.getMoney() > 0 && askForAnotherRound());
    }

    private void playRound() {
        int bet = getBet();
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
                pause();
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

    private void pause() {
        for (long i = 0; i < PAUSE_TIME; i++){
        }
    }

    private void humanWonRound(int bet) {
        printBothHands();
        System.out.println("You've won this round!");
        human.winMoney(bet * 2);
    }

    private void humanLostRound(int bet) {
        printBothHands();
        pause();
        System.out.println("You've lost this round!");
        human.looseMoney(bet);
    }

    private boolean askForAnotherRound() {
        String answer;
        char firstLetter;
        do {
            System.out.print("Would you like another round? (Yes / No / Quit)");
            answer = scanner.next();
            firstLetter = Character.toUpperCase(answer.charAt(0));
        } while (firstLetter != YES && firstLetter != NO && firstLetter != QUIT);
        return firstLetter == YES;
    }

    private int getBet() {
        String answer;
        int bet;
        do {
            System.out.print("Place your bet ( ");
            for (int validBet : VALID_BETS) {
                System.out.print(validBet + " ");
            }
            System.out.print("): ");
            answer = scanner.next();
            checkIfGameIsToBeFinished(Character.toUpperCase(answer.charAt(0)));
            try {
                bet = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                bet = 0;
            }
        } while (!isValidBet(bet));
        return bet;
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

    private boolean isDrawAnother() {
        String answer;
        char firstLetter;
        do {
            System.out.print("Would you like another card? (Draw / Stand / Quit)");
            answer = scanner.next();
            firstLetter = Character.toUpperCase(answer.charAt(0));
        } while (firstLetter != DRAW && firstLetter != STAND && firstLetter != QUIT);
        checkIfGameIsToBeFinished(firstLetter);
        return firstLetter == DRAW;
    }

    private void printBothHands() {
        System.out.println("\nEnd of round results:");
        pause();
        printHand(human);
        printHand(dealer);
    }

    private void printHand(BlackjackPlayer player) {
        System.out.print(player.equals(human) ? "Your " : "Dealer's ");
        player.printHand();
    }

    private void checkIfGameIsToBeFinished(char firstLetter) {
        if (firstLetter == QUIT) {
            finishGame();
        }
    }

    private void finishGame() {
        System.out.println("\nYou have played " + gamesPlayed + " games and won " + gamesWon);
        human.printCurrentSumOfMoney();
        this.scanner.close();
        System.exit(0);
    }
}
