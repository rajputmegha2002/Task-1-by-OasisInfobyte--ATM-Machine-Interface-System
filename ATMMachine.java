import java.util.*;

class ATM {

    float Balance;
    int PIN = 1111;

    public void CheckPin() {

        System.out.print("\nEnter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int Pin = sc.nextInt();
        System.out.println(" ");

        if (Pin == PIN) {

            Menu();
        } else {
            System.out.println("Enter Valid Pin");
            CheckPin();
        }

    }

    public void Menu() {
        System.out.println("Enter Your Choice ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer Amount");
        System.out.println("5. Quit");

        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        int enteredchoice = sc.nextInt();

        if (enteredchoice == 1) {
            CheckBalance();
        } else if (enteredchoice == 2) {
            Withdraw();
        } else if (enteredchoice == 3) {
            Deposit();
        } else if (enteredchoice == 4) {
            Transfer();
        } else if (enteredchoice == 5) {
            return;
        } else {
            System.out.println("Enter valid choice");
        }
    }

    public void CheckBalance() {
        System.out.println(Balance);
        System.out.println(" ");
        Menu();

    }

    public void Withdraw() {
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();
        if (withdrawAmount <= Balance) {
            System.out.println("Your Amount is Withdraw Successfully: ");
        } else {
            System.out.println("Insufficient Amount. ");
        }
        System.out.println(" ");

        Balance = Balance - withdrawAmount;
        Menu();
    }

    public void Deposit() {
        System.out.println("Enter Amount to Deposit; ");
        Scanner sc = new Scanner(System.in);
        float DepositAmount = sc.nextFloat();
        System.out.println("Your Amount is Deposite Successfully: ");

        System.out.println(" ");

        Balance = Balance + DepositAmount;
        Menu();

    }

    public void Transfer() {
        System.out.println("Enter Amount to Transfer: ");
        Scanner sc = new Scanner(System.in);
        Float TransferAmount = sc.nextFloat();
        System.out.println("Your Amount is Transfer Successsfully: ");
        System.out.println(" ");

        Balance = Balance - TransferAmount;
        Menu();
    }

}

public class ATMMachine {

    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.CheckPin();

    }

}
