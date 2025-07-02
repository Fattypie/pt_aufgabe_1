package bankAccount;

public class SavingsAccount extends BankAccount {
    private int interest;
    
    public SavingsAccount(String id, int interest) {
        super(id);
        assert interest >= 0: "Zinssatz muss >= 0 sein.";
        this.interest = interest;
    }
    
    public SavingsAccount(String id, long balance, int interest) {
        super(id, balance);
        assert interest >= 0: "Zinssatz muss >= 0 sein.";
        this.interest = interest;
    }
    
    public void giveInterest() {
       long balance = this.getAccountBalance();
       long interestValue = (balance * interest) / 1000;
       this.deposit(interestValue);
    }
    
    public int getInterestRate() {
        return interest;
    }
    
    @Override
    public String toString() {
        return String.format("SavingsAccount Id: %s ; Balance: %d ; Interest: %d%n", this.getAccountId(), this.getAccountBalance(), interest);
    }
}
