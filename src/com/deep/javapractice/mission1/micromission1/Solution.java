package com.deep.javapractice.mission1.micromission1;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter " + (i + 1) + "th Mark: ");
      marks[i] = sc.nextInt();
    }
    System.out.println("Total Marks: " + totMark(marks));
    System.out.println("Average: " + avg(marks));
    disp(marks);
    sc.close();
  }

  public static int totMark(int[] tot) {
    int len = tot.length;
    int tots = 0;
    for (int i = 0; i < len; i++) {
      tots += tot[i];
    }
    return tots;
  }

  public static float avg(int[] tot) {
    return (float) totMark(tot) / tot.length;
  }

  public static void disp(int[] tot) {
    for (int i = 0; i < tot.length; i++) {
      System.out.print("Your mark: " + tot[i] + ", Your Grade: ");
      dispUnit(tot[i]);
    }
  }

  public static void dispUnit(int n) {
    if (n >= 75 && n <= 100) {
      System.out.println("Distinction");
    } else if (n >= 60 && n <= 74) {
      System.out.println("First Class");
    } else if (n >= 40 && n <= 59) {
      System.out.println("Pass");
    } else if (n > -1 && n <= 39) {
      System.out.println("Fail");
    } else {
      System.out.println("Invalid Input");
    }
  }

}
