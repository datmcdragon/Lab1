package com.company;

import java.util.Objects;

class User {
  String firstName;
  String lastName;
  int age;
  String email;

  @Override
  public boolean equals(Object o) {
    User user = (User) o;
    return age == user.age
        && firstName.equals(user.firstName)
        && lastName.equals(user.lastName)
        && email.equals(user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, email);
  }
}

public class Task6 {
  public static void main(String[] args) {}
}
