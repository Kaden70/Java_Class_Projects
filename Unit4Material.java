package unit_4;

// 1.
public class Unit4Material {
    public static void main(String[] args) {
        // 2.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] games = new String[4];

        // 3.
        System.out.println(cars[2]);

        // 4.
        cars[1] = "Opel";
        System.out.println(cars[1]);
        // 5.
        System.out.println(cars.length);

        games[0] = "Minesweeper";
        games[1] = "Chess";
        games[2] = "Fallout";
        games[3] = "POSTAL 2";

        // 6.
        for (int count = 0; count < 5; count++) {
            System.out.println (games[count]);
        }

        // 7.
        String[] OS = {"Windows", "macOS", "Linux", "TempleOS"};

        // 8.
        String[][] combination = { {"Minesweeper", "Chess", "Fallout", "POSTAL 2"}, {"Windows", "macOS", "Linux", "TempleOS"} };

        // 9.
        for (int i = 0; i < combination.length; i++) {
            for (int j = 0; j < combination[i].length; j++) {
                System.out.println(combination[i][j]);
            }
        }
    }
}
