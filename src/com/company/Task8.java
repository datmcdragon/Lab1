package com.company;

import java.util.Objects;

class CustomDouble {
  int tsila;
  double drobova;

  public CustomDouble(int tsila, double drobova) {
    this.tsila = tsila;
    this.drobova = drobova;
  }

  public void add(CustomDouble customDouble) {
    System.out.println("Ціла частина: " + (customDouble.tsila + tsila));
    System.out.println("Дробова частина: " + (customDouble.drobova + drobova));
  }

  public void minus(CustomDouble customDouble) {
    System.out.println("Ціла частина: " + (customDouble.tsila - tsila));
    System.out.println("Дробова частина: " + (customDouble.drobova - drobova));
  }

  @Override
  public boolean equals(Object o) {
    CustomDouble obj = (CustomDouble) o;
    return tsila == obj.tsila && Double.compare(obj.drobova, drobova) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(tsila, drobova);
  }
}

public class Task8 {
  public static void main(String[] args) {
    CustomDouble customDouble = new CustomDouble(10, 50);
  }
}
