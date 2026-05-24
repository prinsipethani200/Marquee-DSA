package Fanction;
import java.util.*;

//number guessing game...
public class Fun13 {
    static void playGame() {
        Scanner sc = new Scanner(System.in);
        int secret = 57;
        int guess;

        do {
            System.out.print("Enter number between 1 to 100: ");
            guess = sc.nextInt();

            if (guess > secret) {
                System.out.println("Too high");
            }
            else if (guess < secret) {
                System.out.println("Too low");
            }
            else {
                System.out.println("Correct Number");
            }
        } while (guess != secret);
    }

    public static void main(String[] args) {
        playGame();
    }
}

