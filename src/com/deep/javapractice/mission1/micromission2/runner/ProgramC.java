package com.deep.javapractice.mission1.micromission2.runner;

import com.deep.javapractice.mission1.micromission2.logic.Immutable;

public class ProgramC {
  public static void main(String[] args) {
    Immutable im = new Immutable("Deep", 21);
    im.getObj();
    // im.name = (shows error)
    // im.age = 3; (Field not visible)
  }
}
