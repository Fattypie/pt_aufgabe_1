package bankAccount;

abstract class BankAccount {
    private final String id;    //just like javaScript const, it cannot change anything
    private long balance;
    
    public BankAccount (String id, long balance) {
        assert id != null && !id.isEmpty() : "Id darf nicht leer oder null sein";
        assert balance >= 0: "Balance muss ein Betrag >= 0 sein.";
        this.id = id;
        this.balance = balance;
    }
    
    public BankAccount (String id) {
        assert id != null && !id.isEmpty() : "Id darf nicht leer oder null sein";
        this.id = id;
        balance = 0;        //if not balance parameter, set to 0
    }
    
    public void deposit (long money) {
        assert money >= 0: "Money muss ein Betrag >= 0 sein.";
        balance += money;       //E.G i put money on the account, then it will get more
    }
    
    public void withdraw (long money) {     //void is better for the transfer part
        assert money >= 0: "Money muss ein Betrag >= 0 sein.";
        assert money <= balance: "Nicht genug Geld auf dem Konto zum entnehmen";
        balance -= money;       //i take money out
    }
    
    public String getAccountId() {
        return this.id;
    }
    // First no setBalance, because withdraw/deposit is setter functionality
    public long getAccountBalance() {
        return this.balance;
    }
    
    @Override
    public String toString() {
        return String.format("Bank Account: %s ; current balance: %d", id, balance);
    }
}
