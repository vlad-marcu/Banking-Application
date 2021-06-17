import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        System.out.println("Hello, please enter your credentials");
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Name=");
        String customerName = scanner.next();
        System.out.print("Your Id=");
        String customerId = scanner.next();
        System.out.print("Your Balance=");
        int balance = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(balance, customerName, customerId);
        bankAccount.ShowMenu();
    }

}
