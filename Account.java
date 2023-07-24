import java.util.Date;
import java.util.Scanner;
 class Account {
    private int ID = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    //private double overdraftLimit = -50;

    private int someData;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int ID, double balance) {
//        this();
        this.ID = ID;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
     public void setBalance(double balance) {
//        if (balance > 10000000) return;
//        if (balance < 0) return;
         this.balance = balance;
     }

    public double getBalance() {
        return balance;
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

    public static Checking main2() {
        final Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        Saving[] savings = new Saving[10];
        Checking[] checking = new Checking[10];

        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100.00);
            checking[i] = new Checking(i, 100.00, 50);
            savings[i] = new Saving(i, 100.00);
        }

        System.out.print("Enter an ID (1-10): ");
        int id = input.nextInt();

        if (id < 1 || id > 10) {
            id = incorrectId(id);
        }
        while (true) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 6) {
                System.out.println("Enter an ID (1-10): ");
                id = input.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            menuOptions(id, choice, accounts, savings, checking);
        }
    }

    public static int incorrectId(int id) {
        Scanner input = new Scanner(System.in);
        while(id < 1 || id > 10) {
            System.out.println("Please enter a valid ID: ");
            id = input.nextInt();
            System.out.println();
        }
        return id;
    }
    public static void menuOptions(int id, int choice, Account[] accounts, Saving[] savings, Checking[] checking) {
        Scanner input = new Scanner(System.in);
        switch(choice) {
            case 1:
                System.out.print("The balance of your checking account is: " + checking[id].getBalance());
                break;
            case 2:
                System.out.print("The balance of your savings account is: " + savings[id].getBalance());
                break;
            case 3:
                System.out.print("Enter the amount you want to withdraw: ");
                    checking[id].withdraw(input.nextDouble());
                break;
            case 4:
                System.out.print("Enter the amount you want to deposit: ");
                checking[id].deposit(input.nextDouble());
                break;
            case 5:
                System.out.print("Enter the amount you want to deposit: ");
                savings[id].withdraw(input.nextDouble());
                break;
            default:
                break;
        }
    }

    public static void menuDisplay() {
        System.out.print("\nMenu options\n");
        System.out.println("1: View checking balance");
        System.out.println("2: View savings balance");
        System.out.println("3: Withdraw money from checking account");
        System.out.println("4: Deposit money into checking");
        System.out.println("5: Deposit money into savings");
        System.out.println("6: Exit");
    }

}