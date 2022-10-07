package com.company;

class Calculator {
  public static void add(double num1, double num2) {
    if (num1 % ((int) num1) != 0) {
      CustomDouble customDouble1 = new CustomDouble((int) num1, num1 % ((int) num1));
      CustomDouble customDouble2 = new CustomDouble((int) num2, num2 % ((int) num2));
      customDouble1.add(customDouble2);
    }
  }

  public static void minus(double num1, double num2) {
    if (num1 % ((int) num1) != 0) {
      CustomDouble customDouble1 = new CustomDouble((int) num1, num1 % ((int) num1));
      CustomDouble customDouble2 = new CustomDouble((int) num2, num2 % ((int) num2));
      customDouble1.minus(customDouble2);
    }
  }

  public static void multiply(CustomDouble num1, CustomDouble num2) {
    Double double1 = (Double) (num1.tsila + num1.drobova);
    Double double2 = (Double) (num1.tsila + num2.drobova);
    System.out.println(double1 * double2);
  }
  public static void div(CustomDouble num1, CustomDouble num2) {
        Double double1 = (Double) (num1.tsila + num1.drobova);
        Double double2 = (Double) (num1.tsila + num2.drobova);
        System.out.println(double1 / double2);
    }
}

public class Task9 {
  public static void main(String[] args) {
    Calculator.add(10.50, 10.50);
    Calculator.minus(10.50, 10.50);
  }
}
