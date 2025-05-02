// Create A Class Game , Which Allows A user to play "Guess The Number" 

// Jo Tame Guess karel Number Computer E Guesss Karela Number Karta Moto che to pachu Guess karvanu ee rite Tame (User) Ketla Guess ma Computer ee Guess Karela Number Sudhi Pochi sako 
// Basiclly jem Number Of Guesses ocha tem Tame win (For 2 Players Ramo To) 

// game once. Game should have the following methods:

// 1. Constructor to generate the random number

// 2. takeUserInput() to take a user input of number

// 3. isCorrectNumber() to detect whether the number entered by the user is true

// 4. getter and setter for noofGuesses

// Use properties such as noofGuesses (int), etc to get this task done!

// The Number Is Between 0-100

import java.util.Scanner;

class Game {
    double randomNumber_ByComputer; // by computer
    double randomNumber_ByUser; // by player
    int noOfGuess = 0;

    public Game() {

        randomNumber_ByComputer = Math.random();
        randomNumber_ByComputer *= 100;
        randomNumber_ByComputer += 0;

    }

    public void takeNumber_ByUser() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess The Number : ");
        randomNumber_ByUser = sc.nextInt();
        
        isCorrectNumber();        
        
    }

    public void isCorrectNumber() {
        if (Math.round(randomNumber_ByComputer) == randomNumber_ByUser) {
            System.out.println("You Win By " + noOfGuess + " Number Of Guess");
        } 
        
        else if (Math.round(randomNumber_ByComputer) < randomNumber_ByUser) {
            System.out.println("Your Number Is Bigger Than Computer Number \n ReEnter Your Guess Number : ");
            noOfGuess++;
            takeNumber_ByUser();
        } 
        
        else {
            System.out.println("Your Number Is Smaller Than Computer Number \n ReEnter Your Guess Number : ");
            noOfGuess++;
            takeNumber_ByUser();
        }
    }

}

public class O5GuessTheNumber {
    public static void main(String[] args) {

        Game g1 = new Game();

        g1.takeNumber_ByUser();
        

    }
}