import java.util.Date;

class Account {
    private int ID = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    private int someData;
    public Account() {
        dateCreated = new Date();
    }

    public Account(int ID, double balance) {
        this();
        this.ID = ID;
        this.balance = balance;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 10000000) return;
        if(balance < 0) return;
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getAnnualInterestRate() / 100);
    }

    public void withdraw(double amountToWithdraw) {
        balance -= amountToWithdraw;
    }

    public void deposit(double amountToDeposit) {
        balance += amountToDeposit;
    }
}