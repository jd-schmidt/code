package com.caveofprogramming.designpatterns.demo1.model;

/**
 * Created by jd on 5/7/15.
 */
public class Person {
  private int id;
  private String name;
  private String password;

  public Person() {};

  public Person(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public Person(int id, String name, String password) {
    this.id = id;
    this.name = name;
    this.password = password;
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Person person = (Person) o;

    if (!name.equals(person.name)) {
      return false;
    }
    if (!password.equals(person.password)) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + password.hashCode();
    return result;
  }
}
