package com.deep.javapractice.mission1.micromission4.logic;

public abstract class Bird implements Flyable {
  public void Fly() {
    System.out.println("Has Wings and Flies");
  }

  public abstract void calls();
}
