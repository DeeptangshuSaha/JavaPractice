package com.deep.javapractice.mission1.micromission1;

public class ProgramC {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(n);
    if (n >= 90 && n <= 100) {
      System.out.println("Grade A");
    } else if (n >= 80 && n <= 89) {
      System.out.println("Grade B");
    } else if (n >= 70 && n <= 79) {
      System.out.println("Grade C");
    } else if (n >= 60 && n <= 69) {
      System.out.println("Grade D");
    } else if (n >= 50 && n <= 59) {
      System.out.println("Grade E");
    } else if (n > -1 && n <= 49) {
      System.out.println("FAIL");
    } else {
      System.out.println("Invalid Input");
    }

    switch ((int) n / 10) {
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("FAIL");
        break;
      case 5:
        System.out.println("Grade E");
        break;
      case 6:
        System.out.println("Grade D");
        break;
      case 7:
        System.out.println("Grade C");
        break;
      case 8:
        System.out.println("Grade B");
        break;
      case 9:
      case 10:
        System.out.println("Grade A");
        break;
      default:
        System.out.println("Invalid Input");
    }
  }
}
