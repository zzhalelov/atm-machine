public class AtmOperationImpl implements AtmOperationInterf {
    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.println("Abailable balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

    }
}