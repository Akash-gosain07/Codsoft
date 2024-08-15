import java.util.Scanner;

public class ATMInterface {
    private double balance = 1000.0; 

    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface();
        atm.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash(scanner);
                    break;
                case 3:
                    depositCash(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private void withdrawCash(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
    }

    private void depositCash(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }
}