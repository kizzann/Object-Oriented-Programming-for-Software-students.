public class Saving extends Account {

    public Saving() {
        super();
    }
    public Saving(int ID, double balance) {
        super(ID, balance);
    }

    public void withdraw(double amount) {
        if(amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Your savings account overdraw request has been denied.");
    }

    public String toString() {
        return super.toString() + "Savings accounts cannot be overdrawn!";
    }
}
