public class BlockStatement {
    public static void main(String[] args) {


        {

            int studentNumber = 12345;
            int secondNumber = 50;
            int sum = studentNumber + secondNumber;


            System.out.println("Inside the block:");
            System.out.println("Student Number: " + studentNumber);
            System.out.println("Second Number: " + secondNumber);
            System.out.println("Sum: " + sum);
        }


        System.out.println("\nOutside the block - variables are not accessible here.");
        System.out.println("If you try to access studentNumber here, you'll get a compilation error!");
    }
}