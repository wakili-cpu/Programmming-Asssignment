import java.util.Scanner;

public class HeightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in feet (e.g., 5.8 for 5 feet 8 inches): ");
        double height = scanner.nextDouble();

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height >= 5.583) { // 5'7" = 5.583 feet
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }

        scanner.close();
    }
}