package src.com.deep.javapractice.mission1.micromission2.logic;

public class Immutable {
  final String name;
  final int age;

  public Immutable(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void getObj() {
    System.out.print(name + " " + age);
  }
}
