package src.com.deep.javapractice.mission1.micromission2.runner;

import src.com.deep.javapractice.mission1.micromission2.logic.BankAccount;

public class ProgramA {
  public static void main(String[] args) {
    BankAccount acc = new BankAccount("123456789", 500);
    System.out.println("$" + acc.getBalance());
    acc.deposit(50);
    System.out.println("$" + acc.getBalance());
    acc.withdraw(12.23f);
    System.out.println("$" + acc.getBalance());
  }
}
