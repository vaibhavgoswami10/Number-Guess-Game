import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInpur() {
        System.out.println("Guess the number"); 
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectAnswer() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right ,it was %d\n. You guessed it in %d attempts", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too Low.....");
        } else if (inputNumber > number) {
            System.out.println("Too High...");
        }
        return false;
    }
}

public class guess {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInpur();
            b = g.isCorrectAnswer();
        }

    }

}
