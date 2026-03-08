package com.laioffer.basic.serializable.serialVersionUID;

import java.io.Serializable;

import androidx.annotation.NonNull;

public class User1 implements Serializable {

  private static final long serialVersionUID = 1;

  public User1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String name;
  public int age;
  // public String nickName;

  @NonNull
  @Override
  public String toString() {
    return "User1{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
