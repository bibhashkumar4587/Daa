import java.util.Scanner;

public class power_code {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        if (n % 2 == 0) {
            double halfPower = power(x, n / 2);
            return halfPower * halfPower;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for power");
        System.out.println("Press 2 for exit");

        while (true) {
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter base value :");
                    int x = scanner.nextInt();
                    System.out.println("Enter power value");
                    int n = scanner.nextInt();
                    System.out.println(power(x, n));
                    System.out.println();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
