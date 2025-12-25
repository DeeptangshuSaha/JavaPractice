package com.deep.javapractice.mission1.micromission4.runner;

import com.deep.javapractice.mission1.micromission4.logic.CardPayment;
import com.deep.javapractice.mission1.micromission4.logic.Payment;
import com.deep.javapractice.mission1.micromission4.logic.UPIPayment;

public class ProgramB {
  public static void main(String[] args) {
    Payment upiPayment = new UPIPayment();
    Payment cardPayment = new CardPayment();

    upiPayment.pay(3);
    cardPayment.pay(5);
  }
}
