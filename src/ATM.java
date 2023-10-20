public class ATM {
    private double balance;
    private double deposit_amount;
    private double withdrawAmount;
    //constructor

    public ATM(double balance, double deposit_amount, double withdrawAmount) {
        this.balance = balance;
        this.deposit_amount = deposit_amount;
        this.withdrawAmount = withdrawAmount;
    }

    //getter setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit_amount() {
        return deposit_amount;
    }

    public void setDeposit_amount(double deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
