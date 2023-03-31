package myAccount;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        double balance = account.getBalance();
        double interest = account.getMonthlyInterest();
        double total = balance + interest;
        java.util.Date createdAt = account.getDateCreated();

        System.out.println(
                "Balance: " + "\t\t" + balance + "\n" +
                        "Interest: " + "\t\t" + interest + "\n" +
                        "Created On: " + "\t\t" + createdAt.toString());
        System.out.println("===========================================");
        System.out.println(
                "Total in account: " + "\t\t" + total);
        System.out.println("===========================================");
    }
}

