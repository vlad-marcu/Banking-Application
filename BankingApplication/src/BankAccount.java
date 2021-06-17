import java.util.Scanner;

public class BankAccount {

    int balance;
    int previousTransaction;
    String customenName;
    String customerId;

    public BankAccount(int balance, String customenName, String customerId) {
        this.balance = balance;
        this.previousTransaction = 0;
        this.customenName = customenName;
        this.customerId = customerId;
    }

    void deposit(int amount) {

        if (amount > 0) {

            balance += amount;
            previousTransaction = amount;

        }

    }

    void withdraw(int amount) {

        if (amount > 0) {

            if (amount > balance) {

                System.out.println("You don't have enough money to withdraw the amount you entered");
            } else {
                balance -= amount;
                previousTransaction = -amount;
            }

        }

    }

    void getPreviousTransaction() {

        if (previousTransaction > 0) {

            System.out.println("Deposited= " + previousTransaction);

        } else if(previousTransaction < 0){

            System.out.println("Withdrawn= " + Math.abs(previousTransaction));
        } else {

            System.out.println("No transaction happened");
        }
    }

    void ShowMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome=" + customenName);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Show Previous Transaction");
        System.out.println("E. Exit");

        do {

            System.out.println("=================================================================");
            System.out.println("What do you want to do ?");
            System.out.println("=================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Your balance is=" + balance);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("-----------------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("-----------------------------------------------------------------");
                    int amount1 = scanner.nextInt();
                    withdraw(amount1);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("#################################################################");
                    break;

                default:
                    System.out.println("Invalid option ! Please enter another one ");
                    System.out.println("\n");
                    break;

            }


            } while(option != 'E');

        System.out.println("Thank you for using our sevices ! Have a good day !");
        }









    }





