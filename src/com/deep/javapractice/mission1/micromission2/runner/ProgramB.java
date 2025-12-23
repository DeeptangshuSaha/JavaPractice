package com.deep.javapractice.mission1.micromission2.runner;

import com.deep.javapractice.mission1.micromission2.logic.Student;

public class ProgramB {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.getGrade());
    Student s2 = new Student("Andy", 1, 74);
    System.out.println(s2.getGrade());
  }
}
