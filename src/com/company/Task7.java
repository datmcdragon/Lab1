package com.company;

import java.util.HashMap;
import java.util.Map;

class Product {
  String name;
  int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }
}

public class Task7 {
  public static void main(String[] args) {
    Map<Product, Integer> para = new HashMap<>();
    Product bread = new Product("bread", 20);
    Product milk = new Product("milk", 35);
    Product tea = new Product("tea", 40);
    para.put(bread, 1);
    para.put(milk, 2);
    para.put(tea, 3);
    int check[] = new int[3];
    check[0] = para.get(0) * bread.price;
    check[1] = para.get(1) * milk.price;
    check[2] = para.get(3) * tea.price;
    for (int i = 0; i < check.length; i++) {
      System.out.println("Товар " + i + " на суму " + check[i]);
    }
  }
}
