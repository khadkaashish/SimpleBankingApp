package BankingApp;

public class Account {
    private String CustomerName;
    private String AccountNumber;
    private String Email;
    private double Balance;
    private String PhoneNumber;

    public Account(String CustomerName, String AccountNumber, String Email, double Balance, String PhoneNumber){
        this.CustomerName = CustomerName;
        this.AccountNumber = AccountNumber;
        this.Email = Email;
        this.Balance = Balance;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double depositedMoney){
        this.Balance += depositedMoney;
        System.out.println("Deposit is successful.\nDeposit amt: "+ this.Balance);
    }

    public void WithDraw(double withdrawalMoney){

        if (this.Balance - withdrawalMoney <0){
            System.out.println("You donot have enough money.\nBalance: "+this.Balance);
        }else{
            this.Balance -= withdrawalMoney;
            System.out.println("Withdrawal successful.\nBalance: "+this.Balance);
        }
    }

    public String getCustomerName(){
        return CustomerName;
    }
    public void setCustomerName(String customerName){
        CustomerName = customerName;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String email){
        Email = email;
    }

    public double getBalance(){
        return Balance;
    }
    public void setBalance(double balance){
        Balance = balance;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        PhoneNumber = phoneNumber;
    }
}


