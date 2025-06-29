import java.util.Scanner;
import java.text.DecimalFormat;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = startPoints;
        int wins = 0;
        int earned = 0;

        for (int i = 0; i < n; i++) {
            String stage = scanner.nextLine();
            int points = 0;
            if (stage.equals("W")) {
                points = 2000;
                wins++;
            } else if (stage.equals("F")) {
                points = 1200;
            } else if (stage.equals("SF")) {
                points = 720;
            }
            totalPoints += points;
            earned += points;
        }


        int average = earned / n;

        double percent = wins * 100.0 / n;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", average);
        System.out.printf("%s%%%n", df.format(percent));
        scanner.close();
    }
}