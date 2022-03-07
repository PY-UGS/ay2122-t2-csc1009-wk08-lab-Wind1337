public class CheckingAccount {
    private String accountNo;
    private double balance;

    public CheckingAccount(String accountNo){
        this.accountNo = accountNo;
        this.balance = 0;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(this.balance < amount){
            throw new InsufficientFundsException(amount);
        }
        else{
            this.balance -= amount;
        }
    }
}
