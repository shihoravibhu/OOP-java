class Account{

    int accNum;
    String accType ;
    double balance ;

    public void setter(int accNum , String accType , double balance){
        this.accNum = accNum ;
        this.accType = accType ;
        this.balance = balance ;
    }
    public void getter(Account temp1 , Account temp2){
        System.out.println("Account 1 Name : "+this.accNum+" Account Type : "+this.accType+" Current Balance : "+this.balance);
        System.out.println("Account 2 Name : "+temp1.accNum+" Account Type : "+temp1.accType+" Current Balance : "+temp1.balance);
        System.out.println("Account 2 Name : "+temp2.accNum+" Account Type : "+temp2.accType+" Current Balance : "+temp2.balance);
        
    }

}

public class Extra3 {
    public static void main(String[] args) {
        
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.setter(101,"vi",10000);
        a2.setter(102,"ui",11000);
        a3.setter(103,"oi",13000);

        a1.getter(a2, a3);
    }
}
