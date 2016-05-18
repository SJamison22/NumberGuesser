package GuessingGame;

import java.util.Scanner;
import java.util.Random;
/**
 * Created by stevejaminson on 4/28/16.
 */
public class GuessingGame {

    public static void main(String[] args) {

        int secret = new Random().nextInt(100);
        boolean correct = false;
        Scanner g = new Scanner(System.in);
        int count = 1;

        System.out.println("Guess a number between 1 and 100: ");
        int guess = g.nextInt();

        while(!correct){

            //set lastGuess equal to new guess at the start of each while loop iteration.
            int lastGuess = guess;

            if(guess < secret){

                //If guess is too low, inform user.
                System.out.println("Guess is too low, guess again: ");
                System.out.println("You have guessed " + count + " times.");

                //If guess is too low, get new guess.
                guess = g.nextInt();

                //compare new guess to last guess, if different add to count.
                // Then run next iteration of while loop.
                if(lastGuess != guess){
                    count++;
                }

            } else if(guess > secret){

                //If guess is too high, inform user.
                System.out.println("Guess is too high, guess again: ");
                System.out.println("You have guessed " + count + " times.");

                //If guess is too low, get new guess.
                guess = g.nextInt();

                //compare new guess to last guess, if different add to count.
                // Then run next iteration of while loop.
                if(lastGuess != guess){
                    count++;
                }

            } else if(guess == secret){

                //If guess is equal to the secret number, set correct
                // to true to end the game and inform user of victory.
                correct = true;
                System.out.println("You win!");
                System.out.println("You have guessed " + count + " times.");
                }
            }
        }
    }

