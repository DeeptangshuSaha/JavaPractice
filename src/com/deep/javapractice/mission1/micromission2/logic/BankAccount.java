package src.com.deep.javapractice.mission1.micromission2.logic;

public class BankAccount {
  private String accountNumber;
  private float balance;

  public BankAccount(String accountNumber, float balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposit(float amt) {
    if (amt >= 0) { // Prevents Unsanitised (Negative) input.
      balance += amt;
    }
  }

  public void withdraw(float amt) {
    if (amt <= balance) { // Check Prevents overdrat.
      balance -= amt;
    } else {
      System.out.println("Not Enough Balance!!");
    }
  }

  public float getBalance() {
    return balance;
  }

  public void getAcc() {
    System.out.print(accountNumber);
  }
}
