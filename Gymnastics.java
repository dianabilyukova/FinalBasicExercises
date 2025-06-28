import java.util.Scanner;
import java.text.DecimalFormat;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();

        double difficulty = 0;
        double execution = 0;


        if (country.equals("Russia")) {
            if (apparatus.equals("ribbon")) {
                difficulty = 9.100;
                execution = 9.400;
            } else if (apparatus.equals("hoop")) {
                difficulty = 9.300;
                execution = 9.800;
            } else if (apparatus.equals("rope")) {
                difficulty = 9.600;
                execution = 9.000;
            }
        } else if (country.equals("Bulgaria")) {
            if (apparatus.equals("ribbon")) {
                difficulty = 9.600;
                execution = 9.400;
            } else if (apparatus.equals("hoop")) {
                difficulty = 9.550;
                execution = 9.750;
            } else if (apparatus.equals("rope")) {
                difficulty = 9.500;
                execution = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (apparatus.equals("ribbon")) {
                difficulty = 9.200;
                execution = 9.500;
            } else if (apparatus.equals("hoop")) {
                difficulty = 9.450;
                execution = 9.350;
            } else if (apparatus.equals("rope")) {
                difficulty = 9.700;
                execution = 9.150;
            }
        }

        double total = difficulty + execution;
        double percent = (20 - total) / 20 * 100;

        DecimalFormat scoreFormat = new DecimalFormat("0.000");
        DecimalFormat percentFormat = new DecimalFormat("0.00");

        System.out.printf("The team of %s get %s on %s.%n",
                country, scoreFormat.format(total), apparatus);
        System.out.printf("%s%%%n", percentFormat.format(percent));
        scanner.close();
    }
}