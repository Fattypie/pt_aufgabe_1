package bankAccount;

public class TransferManager {
    // We dont have any attributes, so we dont have to write a constructor
    public void transfer(CurrentAccount sourceAccount, CurrentAccount targetAccount, long amount) {
        assert sourceAccount != null : "sourceAccount can not be null";
        assert targetAccount != null : "targetAccount can not be null";
        assert amount > 0 : "Amount must be a positive value";
        
        sourceAccount.withdraw(amount);
        targetAccount.deposit(amount);
        
        System.out.println("Deposit finished");
    }
}
