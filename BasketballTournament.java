import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournament;
        int totalMatches = 0;
        int wins = 0;

        while (!(tournament = scanner.nextLine()).equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= n; i++) {
                int our = Integer.parseInt(scanner.nextLine());
                int opp = Integer.parseInt(scanner.nextLine());
                totalMatches++;
                if (our > opp) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",
                            i, tournament, our - opp);
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",
                            i, tournament, opp - our);
                }
            }
        }
        int losses = totalMatches - wins;
        double winPercent = wins * 100.0 / totalMatches;
        double lossPercent = losses * 100.0 / totalMatches;
        System.out.printf("%.2f%% matches win%n", winPercent);
        System.out.printf("%.2f%% matches lost%n", lossPercent);
        scanner.close();
    }
}
