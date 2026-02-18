package unit_3;
import java.util.Scanner;

public class U3Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an intager 100-999: ");
        int chosenNum = input.nextInt();
        input.close();

        for (int i = 13; i < chosenNum; i += 13) {
            System.out.println(i);
        }
    }
}
