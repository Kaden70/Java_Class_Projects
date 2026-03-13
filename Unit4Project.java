package unit_4;
import java.util.Scanner;

public class Unit4Project {
    public static void main(String[] args) {
        String[] adjective = {"large", "ultra cool", "nuclear", "normal", "microscopic", "dangerous", "strange", "watery"};
        String[] nounIdea = {"cool guy", "mystery", "Matrix", "glow", "gas", "boredom", "thought", "idea"};
        String[] nounObject = {"KRool", "Zombie (from PvZ)", "glowie", "IED", "giant", "jelly", "soup", "TedOS"};
        Scanner input = new Scanner(System.in);

        System.out.println("How many randomly generated sentences do you want to see?");
        int count = input.nextInt();
        input.close();

        for (int i = 0; i < count; i++) {
            int randAdjective = (int) (Math.random() * adjective.length);
            int randNounIdea = (int) (Math.random() * nounIdea.length);
            int randNounObject = (int) (Math.random() * nounObject.length);

            System.out.printf("Random Sentence: %s %s %s\n", adjective[randAdjective], nounIdea[randNounIdea], nounObject[randNounObject]);
        }
    }
}
