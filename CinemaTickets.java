import java.util.Scanner;
import java.text.DecimalFormat;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie;
        int totalStudent = 0;
        int totalStandard = 0;
        int totalKid = 0;
        int totalTickets = 0;

        while (!(movie = scanner.nextLine()).equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int student = 0;
            int standard = 0;
            int kid = 0;
            String type;

            while ( (type = scanner.nextLine()).equals("End") == false && (student + standard + kid) < freeSeats) {
                switch (type) {
                    case "student"  -> { student++; }
                    case "standard" -> { standard++; }
                    case "kid"      -> { kid++; }
                }
            }

            int sold = student + standard + kid;
            double percentFull = sold * 100.0 / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movie, percentFull);

            totalStudent += student;
            totalStandard += standard;
            totalKid += kid;
            totalTickets += sold;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%s%% student tickets.%n", df.format(totalStudent * 100.0 / totalTickets));
        System.out.printf("%s%% standard tickets.%n", df.format(totalStandard * 100.0 / totalTickets));
        System.out.printf("%s%% kids tickets.%n", df.format(totalKid * 100.0 / totalTickets));
        scanner.close();
    }
}
