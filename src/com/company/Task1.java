package com.company;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] array = new String[3];
    array[0] = "hellooo";
    array[1] = "world";
    array[2] = "!!!";
    System.out.println("Введіть символ");
    char c = in.next().charAt(0);

    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        int count1 = 0;
        int count2 = 0;
        for (int k = 0; k < array[j].length(); k++) {
          if (array[j].charAt(k) == c) count1++;
        }
        for (int k = 0; k < array[j + 1].length(); k++) {
          if (array[j + 1].charAt(k) == c) count2++;
        }
        if (count2 < count1) {
          String temp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = temp;
        }
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
