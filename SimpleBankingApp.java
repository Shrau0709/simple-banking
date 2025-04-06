import java.util.Scanner;

public class SimpleBankingApp{
    public static void main(String[] args) {
        double balance = 0.0;
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the menu options
            System.out.println("\n--- Simple Banking Application ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter deposit amount: Rs");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited: Rs" + depositAmount);
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: Rs");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrew: Rs" + withdrawAmount);
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Withdrawal amount must be positive.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    // Check balance
                    System.out.println("Current Balance: Rs" + balance);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting... Thank you for using Simple Banking Application!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Keep looping until the user chooses to exit

        scanner.close();
    }
}
