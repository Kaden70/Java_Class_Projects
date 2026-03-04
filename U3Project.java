package unit_3;
import java.util.Scanner;

public class U3Project {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-1000 and the computer will guess it. Respond with: Type L if your number is lower. Type H if your number is higher. Type G if the computer guessed your number. Make sure numbers are uppercase.");
        int number = input.nextInt();

        int guess = 500;
        int amount = 250;
        boolean check = false;

        while (check != true) {
            System.out.println("Is your number " + guess + "?");
            char feedback = input.next().charAt(0);
            if (feedback == 'L') {
                guess = guess - amount;
                amount = (amount / 2) + 1;
            } else if (feedback == 'H') {
                guess = guess + amount;
                amount = (amount / 2) + 1;
            } else if (feedback == 'G') {
                for (int w = 1; w < number + 1; w++) {
                    System.out.println(w + " hip-hip-hooray!");
                }
                check = true;
            }
        }
        input.close();
    }
}
