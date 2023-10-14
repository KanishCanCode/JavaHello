import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = { "Rock", "Paper", "Scissors" };

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.next();

        int computerChoice = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors

        System.out.println("Computer chose: " + choices[computerChoice]);

        if (userChoice.equalsIgnoreCase(choices[computerChoice])) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice == 2)
                || (userChoice.equalsIgnoreCase("Paper") && computerChoice == 0)
                || (userChoice.equalsIgnoreCase("Scissors") && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
