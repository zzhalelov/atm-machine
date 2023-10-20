import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("---WELCOME TO ATM MACHINE---");
        System.out.print("ENTER ATM NUMBER: ");
        int atmNumber = in.nextInt();
        System.out.print("ENTER PIN: ");
        int pin = in.nextInt();
        if (atmNumber == atmnumber && atmpin == pin) {
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit From Application");
                System.out.println("ENTER CHOICE: ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                } else if (ch == 2) {

                } else if (ch == 3) {
                    System.out.println("Enter Amount To Deposit: ");
                    double depositAmount = in.nextDouble();//5000
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {

                } else if (ch == 5) {
                    System.out.println("Collect Your ATM Card\n Thank You For Using ATM Machine");
                    System.exit(0);

                } else {
                    System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }
    }
}