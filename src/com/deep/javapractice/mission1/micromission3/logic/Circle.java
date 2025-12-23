package com.deep.javapractice.mission1.micromission3.logic;

import static java.lang.Math.PI;

import java.util.Scanner;

public class Circle extends Shape {
  public void area(Scanner sc) {
    System.out.print("Enter Radius: ");
    double r = sc.nextDouble();
    System.out.println(PI * r * r);
  }
}
