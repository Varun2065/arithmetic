import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Program exited.");
                break;
            }
            
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            
            performOperation(choice, a, b);
        }
        sc.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n--- Arithmetic Calculator ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static void performOperation(int choice, double a, double b) {
        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;
        }
    }
}
