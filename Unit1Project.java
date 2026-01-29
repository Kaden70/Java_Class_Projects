package unit_1;
import java.util.Scanner;

public class Unit1Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        char firstI;
        char lastI;
        int number;
        int otherNum;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your first initial: ");
        firstI = scanner.nextLine().charAt(0);
        System.out.print("Enter your last initial: ");
        lastI = scanner.nextLine().charAt(0);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.print("Enter another number: ");
        otherNum = scanner.nextInt();
        scanner.close();

        System.out.printf(name + " " + firstI + lastI + "\n" + (number + otherNum) + "\n" + (number - otherNum) + "\n" + (number * otherNum) + "\n" + "%.2f", ((double) number / otherNum));
    }
}