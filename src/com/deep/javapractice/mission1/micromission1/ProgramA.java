package src.com.deep.javapractice.mission1.micromission1;

public class ProgramA {
  public static void main(String args[]) {
    new NumberCheck(4);
    new NumberCheck(-9);
    new NumberCheck(234);
  }
}

class NumberCheck {

  public NumberCheck(int a) {
    System.out.println(oddEve(a));
    System.out.println(loyalty(a));
    System.out.println(digitSum(a));
  }

  boolean oddEve(int test) {
    return test % 2 == 0 ? true : false;
  }

  String loyalty(int test) {
    if (test > 0) {
      return "Positive";
    } else if (test < 0) {
      return "Negative";
    } else {
      return "Zero";
    }
  }

  int digitSum(int test) {
    if (test < 0) {
      test *= -1;
    }
    int sum = 0;
    while (test > 0) {
      sum += test % 10;
      test = test / 10;
    }
    return sum;
  }
}
