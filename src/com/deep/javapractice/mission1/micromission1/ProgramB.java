package src.com.deep.javapractice.mission1.micromission1;

import java.util.Scanner;

public class ProgramB {
  public static void main(String []args) {
    System.out.print("Rows: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String org = "*";
    for (int i=1; i<=n ; i++) {
      System.out.println(org.repeat(i));
    }
    for (int i=n; i>0; i--) {
      System.out.println(org.repeat(i));
    }
    sc.close();
  }
}
