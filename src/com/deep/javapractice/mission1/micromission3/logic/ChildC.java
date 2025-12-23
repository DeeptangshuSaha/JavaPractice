package com.deep.javapractice.mission1.micromission3.logic;

public class ChildC extends ParentC {
  public ChildC(String fName, String cName) {
    super(fName);
    System.out.println("Child Name: " + cName);
  }

  public void greet(String m) {
    super.greet();
    System.out.print(m);
  }
}
