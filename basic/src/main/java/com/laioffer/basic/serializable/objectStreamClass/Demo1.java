package com.laioffer.basic.serializable.objectStreamClass;


import static com.laioffer.basic.serializable.IgnoreConstants.PATH;

import androidx.annotation.NonNull;

import java.io.Serializable;

import com.laioffer.basic.serializable.SerializeableUtils;

/**
 * Serializable 的理解
 */
public class Demo1 {

  public static void main(String[] args) {
    noSerialVersionUID();
  }

  private static void noSerialVersionUID() {
    // 通过 IO 流辅助序列化的
    User user = new User("zero", 18);
    SerializeableUtils.saveObject(user, PATH + "a.out");
    System.out.println("序列化: " + user);

    user = SerializeableUtils.readObject(PATH + "a.out");
    System.out.println("反序列化: " + user);
  }
}

class User implements Serializable {

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String name;
  public int age;

  public String nickName;

  @NonNull
  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", nickName=" + nickName +
        '}';
  }
}
