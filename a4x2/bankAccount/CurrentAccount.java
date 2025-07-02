package bankAccount;

public class CurrentAccount extends BankAccount{
    private int fee;
    
    public CurrentAccount(String id, int fee) {
        super(id);
        assert fee >= 0: "Fee must be >= 0";
        this.fee = fee;
    }
    
    public CurrentAccount(String id, long balance, int fee) {
        super(id, balance);
        assert fee >= 0: "Fee must be >= 0";
        this.fee = fee;
    }
    
    public void setFee(int fee) {
        assert fee >= 0: "Fee must be >= 0";
        this.fee = fee;
    }
    
    public int getFee() {
        return fee;
    }
    
    @Override
    public void withdraw(long money) {  //we use same withdraw, but different parameter
        assert money >= 0: "Money muss ein Betrag >= 0 sein.";
        // We dont have to assert is the balance enough, this will hapen in super method
        super.withdraw(money + fee);
    }
    
    @Override
    public String toString() {
        return String.format("CurrentAccount Id : %s ; Balance : %d ; Withdrawal fee : %d%n", this.getAccountId(), this.getAccountBalance(), fee);
    }
}
