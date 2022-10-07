package com.company;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String str = "HelloWorld";
      System.out.println("Введіть символ");
      char c = in.next().charAt(0);
      str = str.substring(0, str.indexOf(c)) + str.substring(str.indexOf(c)+1);
    System.out.println(str);
  }
}
