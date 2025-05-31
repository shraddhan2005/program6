// BankCustomer.java
class BankCustomer {
    String customerId;
    String customerName;
    String customerAddress;

    public BankCustomer(String customerId, String customerName, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void pushToMainBranch() {
        System.out.println("Pushing customer data to the main branch...");
    }
}

// BankTransaction.java
class BankTransaction {
    String bankName;
    String accountName;
    String accountHolderName;
    String accountType; // saving or business
    String accountNumber;
    double balance;

    public BankTransaction(String bankName, String accountName, String accountHolderName, String accountType, String accountNumber, double balance) {
        this.bankName = bankName;
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void pushToBankTransactionBranch() {
        System.out.println("Pushing transaction to bank-transaction branch...");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("C001", "John Doe", "123 Main St");
        customer.pushToMainBranch();

        BankTransaction transaction = new BankTransaction("SBI", "Canara Bank of Baroda", "John Doe", "Saving", "ACC123456", 5000.00);
        transaction.pushToBankTransactionBranch();

        // Simulate GitHub push every 13 minutes (just for concept, not real-time)
        System.out.println("Simulating GitHub push and Jenkins build every 13 minutes...");
    }
}