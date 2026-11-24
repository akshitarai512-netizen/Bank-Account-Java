public class Main1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Aarav Sharma", 5000);
        BankAccount acc2 = new BankAccount(1002, "Priya Nair", 12000);

        System.out.println("--- Account 1 Operations ---");
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(10000);   

        System.out.println("\n--- Account 2 Operations ---");
        acc2.deposit(3000);
        acc2.withdraw(4500);

        System.out.println("\n--- Final Details ---");
        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
    }
}
