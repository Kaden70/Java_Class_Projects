package unit_3;
import java.util.Scanner;
// Number guessing game
public class U3Project {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1-1000 and the computer will guess it. Respond with: Type L if your number is lower. Type H if your number is higher. Type G if the computer guessed your number. Make sure numbers are uppercase.");

        int low = 1;
        int high = 1000;
        boolean check = false;

        while (check != true) {
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "?");
            char feedback = input.next().charAt(0);
            if (feedback == 'L') {
                high = guess - 1;
            } else if (feedback == 'H') {
                low = guess + 1;
            } else if (feedback == 'G') {
                for (int w = 1; w < guess + 1; w++) {
                    System.out.println(w + " hip-hip-hooray!");
                }
                check = true;
            }
        }
        input.close();
    }
}
