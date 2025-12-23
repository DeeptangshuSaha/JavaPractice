package com.deep.javapractice.mission1.micromission3.logic;

import java.util.Scanner;

public class Rectangle extends Shape {
  public void area(Scanner sc) {
    System.out.print("Enter Length:");
    double l = sc.nextDouble();
    System.out.print("Enter Width:");
    double w = sc.nextDouble();
    System.out.println(l * w);
  }
}
