package com.company;

public class Task3 {
  public static int getFactorial(int f) {
    int result = 1;
    for (int i = 1; i <= f; i++) {
      result = result * i;
    }
    return result;
  }

  public static void main(String[] args) {
    int factorial5 = getFactorial(5);
    int factorial5For = 1;
    for (int i = 1; i <= 5; i++) {
      factorial5For *= i;
    }
    System.out.println(factorial5 + " " + factorial5For);
  }
}
