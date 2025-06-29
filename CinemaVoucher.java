import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());
        int tickets = 0;
        int others = 0;
        String purchase;

        while (!(purchase = scanner.nextLine()).equals("End")) {
            int price;
            if (purchase.length() > 8) {
                price = purchase.charAt(0) + purchase.charAt(1);
            } else {
                price = purchase.charAt(0);
            }

            if (price > voucher) {
                break;
            }

            voucher -= price;
            if (purchase.length() > 8) {
                tickets++;
            } else {
                others++;
            }
        }

        System.out.println(tickets);
        System.out.println(others);
        scanner.close();
    }
}
