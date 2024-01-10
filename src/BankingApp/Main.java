package BankingApp;


public class Main {

    public static void main (String[] args){
        System.out.println("Simple Banking App");

        Account newAcc =  new Account ("Ashish", "191919798", "a@gmail.com", 10000, "911020202");
        newAcc.DepositMoney(5000);
        newAcc.WithDraw(500000);
        System.out.println("Name: "+newAcc.getCustomerName());
        System.out.println("Customer Account Number: "+newAcc.getAccountNumber());
    }
}
