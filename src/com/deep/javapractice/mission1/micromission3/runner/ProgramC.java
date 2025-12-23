package com.deep.javapractice.mission1.micromission3.runner;

import com.deep.javapractice.mission1.micromission3.logic.ChildC;

public class ProgramC {
  public static void main(String[] args) {
    ChildC c = new ChildC("Jameel", "Yalina");
    c.greet();
    c.greet("Hello");
  }
}
