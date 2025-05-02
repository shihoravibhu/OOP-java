import java.util.Scanner;

class Bank_Account {

    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;    

    public void getAccountDetails(int accountNo , String userName ,  String email , String accountType , int accountBalance){

        this.accountNo = accountNo ;
        this.userName = userName ;
        this.email = email ;
        this.accountType = accountType ;
        this. accountBalance = accountBalance ;
        
    }

    public String displayAccountDetails(){

        return "AccountNo " + this.accountNo + " is having " + this.accountBalance + " Rs in Account" ;

    }
}

public class Lab6a3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Bank_Account ba1 = new Bank_Account() ;
        
        // Bank_Account ba2 = new Bank_Account() ;

        // System.out.println("Enter AccountNo ,userNmae ,email ,accountType ,accountBalance ");
        ba1.getAccountDetails(101,"V","v@gmail.com","SA",15000);

        String ans = ba1.displayAccountDetails();
        System.out.println(ans);

        sc.close();

    }
}
