
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matAcc = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);
        
        matAcc.withdrawal(100);
        myAcc.deposit(100);
        System.out.println(matAcc);
        System.out.println(myAcc);
    }
}
