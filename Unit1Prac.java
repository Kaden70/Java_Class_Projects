package unit_1;
import java.util.Scanner;

public class Unit1Prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Kadn";
        int age = 5;
        char theCharacter = 'K';
        double interestRate = 2.5;

        System.out.println(name + age + theCharacter + interestRate);

        System.out.println("Enter a word: ");
        String userInput = scan.nextLine();

        String theName;
        System.out.println("Enter your name: ");
        theName = scan.nextLine();

        System.out.println("Enter your age: ");
        int theAge = scan.nextInt();
        System.out.println(userInput + theName + theAge);

        int blinks = 200;
        int minutes = 7;
        double blinksPerMinute = blinks / minutes;
        System.out.println(blinksPerMinute);

        double accountBalance;
        System.out.println("Enter your account balance: ");
        accountBalance = scan.nextDouble();
        System.out.printf("Your balance is: $%.2f.", accountBalance);
    }
}