package EdwarActivities.Entities;

public class Account {

    private int accountNumber;
    private long clientDni;
    private double currentBalance;

    public Account(int accountNumber, long clientDni, double currentBalance){
        this.accountNumber = accountNumber;
        this.clientDni = clientDni;
        this.currentBalance = currentBalance;
    }

    public Account(){}

    // setters

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setClientDni(long clientDni){
        this.clientDni = clientDni;
    }

    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }

    // getters

    public int getAccountNumber(){
        return accountNumber;
    }

    public long getClientDni(){
        return clientDni;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }
    
}
