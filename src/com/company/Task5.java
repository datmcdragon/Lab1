package com.company;

public class Task5 {
  public static void main(String[] args) {
      int n = 3;
      int[][] a = new int[n][n];
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              a[i][j] = n*i + j;
          }
      }

      //Виводимо матрицю
      System.out.println("Початкова матриця");
      System.out.println("-----------------");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              System.out.printf("%4d", a[i][j]);
          }
          System.out.println();
      }

      //Транспортування матриці
      for (int i = 0; i < n; i++) {
          for (int j = i+1; j < n; j++) {
              int temp = a[i][j];
              a[i][j] = a[j][i];
              a[j][i] = temp;
          }
      }

      //Виводимо транспортовану матрицю
      System.out.println();
      System.out.println("Новая матриця");
      System.out.println("-------------");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              System.out.printf("%3d", a[i][j]);
          }
          System.out.println();
      }
  }
}
