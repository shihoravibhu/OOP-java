package method;

import java.util.*;

class Bankaccount {

    String accountHolderName;
    int accountNum;
    int balance;
}

public class M1 {
    public static void main(String[] args) {

        Bankaccount acc = new Bankaccount();

        acc.accountHolderName = "vi";
        acc.accountNum = 1234;
        acc.balance = 12;

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {

                System.out.println(
                        "Enter 1 for diposit \n 2 for withdrew \n 3 for check balance and \n then prees anykey (except 1,2,3) :");
                int a = sc.nextInt();

                if (a == 1) {
                    System.out.println("Enter diposit amount : ");
                    int dipositAmount = sc.nextInt();
                    acc.balance += dipositAmount;
                }

                else if (a == 2) {
                    System.out.println("Enter withdrew amount : ");
                    int withdrewAmount = sc.nextInt();
                    if (0 > (acc.balance = acc.balance - withdrewAmount)) {
                        System.out.println("Enter valid ammount failed trasaction");
                        break;
                    }

                }

                else if (a == 3) {
                    System.out.println("total balance : " + acc.balance);
                }

                else {
                    break;
                }
            }

        }
    }
}