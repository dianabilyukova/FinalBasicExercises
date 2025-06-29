import java.util.Scanner;

public class NumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        int score1 = 0;
        int score2 = 0;

        String input;
        while (!(input = scanner.nextLine()).equals("End of game")) {
            int card1 = Integer.parseInt(input);
            int card2 = Integer.parseInt(scanner.nextLine());

            if (card1 > card2) {
                score1 += card1 - card2;
            } else if (card2 > card1) {
                score2 += card2 - card1;
            } else {

                System.out.println("Number wars!");
                int warCard1 = Integer.parseInt(scanner.nextLine());
                int warCard2 = Integer.parseInt(scanner.nextLine());
                if (warCard1 > warCard2) {
                    System.out.printf("%s is winner with %d points", player1, score1);
                } else {
                    System.out.printf("%s is winner with %d points", player2, score2);
                }
                scanner.close();
                return;
            }
        }


        System.out.printf("%s has %d points%n", player1, score1);
        System.out.printf("%s has %d points%n", player2, score2);
        scanner.close();
    }
}