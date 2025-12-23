package com.deep.javapractice.mission1.micromission3.runner;

import com.deep.javapractice.mission1.micromission3.logic.ChildB;
import com.deep.javapractice.mission1.micromission3.logic.ParentB;

public class ProgramB {
  public static void main(String[] args) {
    ParentB pB = new ChildB();
    pB.printP();
  }
}
