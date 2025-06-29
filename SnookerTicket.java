import java.text.DecimalFormat;
import java.util.Scanner;

public class SnookerTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String type = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        char photo = scanner.nextLine().charAt(0);

        double pricePerTicket = 0;

        if (stage.equals("Quarter final")) {
            if (type.equals("Standard")) pricePerTicket = 55.50;
            else if (type.equals("Premium")) pricePerTicket = 105.20;
            else if (type.equals("VIP")) pricePerTicket = 118.90;
        } else if (stage.equals("Simw final")) {
            if (type.equals("Standard")) pricePerTicket = 75.88;
            else if (type.equals("Premium")) pricePerTicket = 125.22;
            else if (type.equals("VIP")) pricePerTicket = 300.40;
        } else if (stage.equals("Final")) {
            if (type.equals("Standard")) pricePerTicket = 110.10;
            else if (type.equals("Premium")) pricePerTicket = 160.66;
            else if (type.equals("VIP")) pricePerTicket = 400.00;
        }
        double total = pricePerTicket * count;

        if (total > 4000) {
            total *= 0.75;
            photo = 'N';
        } else if (total > 2500) {
            total *= 0.90;
        }

        if (photo == 'Y') {
            total += 40 * count;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(total));
        scanner.close();
    }
}
