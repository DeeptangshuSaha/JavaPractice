package com.deep.javapractice.mission1.micromission4.runner;

import com.deep.javapractice.mission1.micromission4.logic.Bike;
import com.deep.javapractice.mission1.micromission4.logic.Car;
import com.deep.javapractice.mission1.micromission4.logic.Vehicle;

public class ProgramA {
  public static void main(String[] args) {
    Vehicle v1 = new Car();
    Vehicle v2 = new Bike();

    v1.move();
    v1.fuelType();
    v2.move();
    v2.fuelType();
  }
}
