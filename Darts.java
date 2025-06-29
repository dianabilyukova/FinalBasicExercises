import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        int points = 301;
        int successful = 0;
        int unsuccessful = 0;
        String command;

        while (!(command = scanner.nextLine()).equals("Retire")) {
            String sector = command;
            int score = Integer.parseInt(scanner.nextLine());
            int hitPoints = 0;


            if (sector.equals("Single")) {
                hitPoints = score;
            } else if (sector.equals("Double")) {
                hitPoints = score * 2;
            } else if (sector.equals("Triple")) {
                hitPoints = score * 3;
            }


            if (hitPoints <= points) {
                points -= hitPoints;
                successful++;
                if (points == 0) {
                    System.out.printf("%s won the leg with %d shots.%n", player, successful);
                    break;
                }
            } else {
                unsuccessful++;
            }
        }

        if (points > 0) {
            System.out.printf("%s retired after %d unsuccessful shots.%n", player, unsuccessful);
        }
        scanner.close();
    }
}