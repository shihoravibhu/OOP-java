import java.util.Scanner;

class Account {
    int balance = 5000;

    public void deposit(int depositAmount) {

        this.balance += depositAmount;

        System.out.println("Deposit successful");
        System.out.println("Current Balance : " + this.balance);

    }

    public void withdraw(int withdrawAmount) {

        try {

            if ((this.balance - withdrawAmount) <= 2000) {

                throw new Exception(
                        "You Cannot Withdarw " + withdrawAmount + " Because Minimum BankBalance is 2000 required");
            } else {
                this.balance -= withdrawAmount;
                System.out.println("Withdarw successful");
                System.out.println("Curret Balance : " + this.balance);
            }

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e);
        }
    }
}

public class Lab10a2 {
    public static void main(String[] args) {

        Account acc1 = new Account();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1(Diposit) And 2(Withdraw) :");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Enter Diposit Amount : ");
            acc1.deposit(sc.nextInt());
        } else if (num == 2) {
            System.out.println("Enter Withdarw Amount : ");
            acc1.withdraw(sc.nextInt());
        }

        sc.close();

    }
}
