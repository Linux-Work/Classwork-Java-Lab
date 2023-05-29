import java.util.Scanner;

public class Account {
    int acct_no;
    String acct_type;
    String customer_name;
    double acct_balance;

    public Account(int acct_no, String acct_type, String customer_name, double acct_balance) {
        this.acct_no = acct_no;
        this.acct_type = acct_type;
        this.customer_name = customer_name;
        this.acct_balance = acct_balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acct_no=" + acct_no +
                ", acct_type='" + acct_type + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", acct_balance=" + acct_balance +
                '}';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data for five customers:");
        Account[] accounts = new Account[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for customer " + (i+1) + ":");
            System.out.print("Account number: ");
            int acct_no = sc.nextInt();
            System.out.print("Account type: ");
            String acct_type = sc.next();
            System.out.print("Customer name: ");
            String customer_name = sc.next();
            System.out.print("Account balance: ");
            double acct_balance = sc.nextDouble();

            accounts[i] = new Account(acct_no, acct_type, customer_name, acct_balance);
        }

        int maxBalanceIndex = 0;

        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].acct_balance > accounts[maxBalanceIndex].acct_balance) {
                maxBalanceIndex = i;
            }
        }

        System.out.println("\nCustomer with maximum account balance:");
        System.out.println(accounts[maxBalanceIndex]);
    }
}