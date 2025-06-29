import java.util.Scanner;
import java.text.DecimalFormat;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String highestMovie = "";
        String lowestMovie = "";
        double highestRating = Double.MIN_VALUE;
        double lowestRating = Double.MAX_VALUE;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sum += rating;

            if (rating > highestRating) {
                highestRating = rating;
                highestMovie = movie;
            }
            if (rating < lowestRating) {
                lowestRating = rating;
                lowestMovie = movie;
            }
        }

        double average = sum / n;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.printf("%s is with highest rating: %s%n", highestMovie, df.format(highestRating));
        System.out.printf("%s is with lowest rating: %s%n", lowestMovie, df.format(lowestRating));
        System.out.printf("Average rating: %s%n", df.format(average));
        scanner.close();
    }
}
