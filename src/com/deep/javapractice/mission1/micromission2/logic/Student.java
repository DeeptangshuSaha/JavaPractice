package com.deep.javapractice.mission1.micromission2.logic;

public class Student {
  private String name;
  private int rollNo;
  private int marks;

  public Student() {
    // this("Default");
  }

  public Student(String name) {
    this.name = name;
    // this(name, 00);
  }

  public Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
    // this(name, rollNo, 00);
  }

  public Student(String name, int rollNo, int marks) {
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
  }

  public int getGrade() {
    return marks;
  }
}
