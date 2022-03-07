import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount("123456");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        checkingAccount.deposit(depositAmount);

        try{
            System.out.print("Please enter amount to withdraw: ");
            double withdrawAmount = input.nextDouble();
            checkingAccount.withdraw(withdrawAmount);
            System.out.println("The balance after withdraw is: $" + checkingAccount.getBalance());
        }
        catch (InsufficientFundsException e){
            System.out.println("Sorry, but your account is short by: $" + (e.getAmount() - checkingAccount.getBalance()));
        }
    }
}
