package com.deep.javapractice.mission1.micromission3.runner;

import com.deep.javapractice.mission1.micromission3.logic.Circle;
import com.deep.javapractice.mission1.micromission3.logic.Rectangle;
import com.deep.javapractice.mission1.micromission3.logic.Shape;
import java.util.Scanner;

public class ProgramA {
  public static void main(String[] args) {
    Shape c = new Circle();
    Shape r = new Rectangle();
    Scanner sc = new Scanner(System.in);
    c.area(sc);
    r.area(sc);
    sc.close();
  }
}
