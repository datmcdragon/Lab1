package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Window {
  private int size;

  public Window(int size) {
    this.size = size;
  }
}

class Door {
  private String material;

  public Door(String material) {
    this.material = material;
  }
}

class Wall {
  private String color;

  public Wall(String color) {
    this.color = color;
  }
}

class House {
  Window window;
  Door door;
  List<Wall> walls = new ArrayList<>();

  public House(Window window, Door door, List<Wall> walls) {
    this.window = window;
    this.door = door;
    this.walls = walls;
  }

  public Window getWindow() {
    return window;
  }

  public void setWindow(Window window) {
    this.window = window;
  }

  public Door getDoor() {
    return door;
  }

  public void setDoor(Door door) {
    this.door = door;
  }

  public List<Wall> getWalls() {
    return walls;
  }

  public void setWalls(List<Wall> walls) {
    this.walls = walls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    House house = (House) o;
    return window.equals(house.window) && door.equals(house.door) && walls.equals(house.walls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(window, door, walls);
  }
}

public class Task10 {
  public static void main(String[] args) {
    Window window = new Window(200);
    Door door = new Door("Oak");
    Wall wall1 = new Wall("gray");
    Wall wall2 = new Wall("gray");
    Wall wall3 = new Wall("gray");
    Wall wall4 = new Wall("gray");
    List<Wall> walls = new ArrayList<>();
    walls.add(wall1);
    walls.add(wall2);
    walls.add(wall3);
    walls.add(wall4);
    House myHouse = new House(window, door, walls);
  }
}
