package com.deep.javapractice.mission1.micromission4.logic;

public class CardPayment implements Payment {
  public void pay(double Amount) {
    System.out.println(Amount + " Payed Via Card");
  }
}
