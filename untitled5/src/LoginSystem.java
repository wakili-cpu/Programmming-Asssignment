import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Storing credentials
        int correctStudentNumber = 12345; // Replace with your student number
        String correctPassword = "pass123";

        int enteredNumber;
        String enteredPassword;

        do {
            System.out.print("Enter student number: ");
            enteredNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();

            if (enteredNumber != correctStudentNumber || !enteredPassword.equals(correctPassword)) {
                System.out.println("Invalid credentials. Try again.\n");
            }

        } while (enteredNumber != correctStudentNumber || !enteredPassword.equals(correctPassword));

        System.out.println("Access Granted!");
        scanner.close();
    }
}