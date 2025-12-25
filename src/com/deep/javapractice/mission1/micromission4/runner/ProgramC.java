package com.deep.javapractice.mission1.micromission4.runner;

import com.deep.javapractice.mission1.micromission4.logic.Bird;
import com.deep.javapractice.mission1.micromission4.logic.Eagle;
import com.deep.javapractice.mission1.micromission4.logic.Flyable;

public class ProgramC {
  public static void main(String[] args) {
    Flyable f = new Eagle();
    Bird b = new Eagle();
    f.Fly();
    b.Fly();
    b.calls();
  }
}
