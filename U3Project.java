package unit_3;
import java.util.Scanner;

public class U3Project {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-1000 and the computer will guess it. Respond with: L means it guess to low. Type H if it guessed to high. Press G if the computer guessed your number.");
        int number = input.nextInt();
        input.close();

        int guess = 500;

        while (guess != number && number > 0 && number < 1001) {
            if (guess == number) {
                for (int w = 0; w < number; w++) {
                    System.out.println("hip-hip-hooray ");
                    if (w == number) {
                        break;
                    }
                }
            System.out.println("Is your number " + guess + "?");
            } else {
                break;
            }
        }
    }
}
