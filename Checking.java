 public class Checking extends Account {
     private double overdraftLimit = 0;

     public Checking() {
         super();
         overdraftLimit = -50.00;
     }


     public Checking(int ID, double balance, double overdraftLimit) {
         super(ID, balance);
         this.overdraftLimit = overdraftLimit;
     }

     public void setOverdraftLimit(double overdraftLimit) {
         this.overdraftLimit = overdraftLimit;
     }

     public double getOverdraftLimit() {
         return overdraftLimit;
     }

     public void withdraw(double amount, double balance) {
         if (getBalance() - amount < getOverdraftLimit()) {
             System.out.println("Error! Amount exceeds overdraft limit.");
         }
         else {
             balance -= amount;
         }
     }

     public String toString() {
         return super.toString() + "\nOverdraft limit is: $" + String.format("%.2f", overdraftLimit);
     }
 }
