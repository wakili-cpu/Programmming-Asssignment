import java.util.Scanner;

public class CountUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        int counter = 1;
        while (counter <= limit) {
            System.out.print(counter + " ");
            counter++;
        }

        scanner.close();
    }
}