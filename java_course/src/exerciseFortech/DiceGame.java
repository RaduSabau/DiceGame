package exerciseFortech;

import java.util.Random;
import java.util.Scanner;


public class DiceGame {


    public static void main(String args[]) {
        int winnerNumber = 50;
        int currentNumber = 0;
        int diceroll = 0;
        var activePlayer = 1;


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Dice Game! Enter the number of players: ");
        int playerNumber = scanner.nextInt();

        while (activePlayer <= playerNumber) {
            System.out.println("Player " + activePlayer + ": Enter 1 for 'Roll' or 0 for 'Hold'");
            int response = scanner.nextInt();
                if (response == 1) {
                    int dice = random.nextInt(6) + 1;
                    currentNumber = currentNumber + dice;
                    diceroll++;

                    System.out.println("Roll #" + diceroll + ": You've rolled a " + dice + ".");

                    if (currentNumber == winnerNumber) {
                        System.out.print("You're on space " + currentNumber + ". Congrats, you win!");

                    } else if (currentNumber > winnerNumber) {
                        System.out.print("Unfortunately, that takes you past " + winnerNumber + " numbers. You lose!");
                    } else {
                        int numbersToGo = winnerNumber - currentNumber;
                        System.out.print("You have " + numbersToGo + " more to go.");
                    }

                } else if (response == 0) {
                    currentNumber = 0;
                    activePlayer ++;

                } else {
                    System.out.println("Invalid action!");
                }

        }

        }
    }


