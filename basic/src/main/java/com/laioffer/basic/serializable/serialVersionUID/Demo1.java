package com.laioffer.basic.serializable.serialVersionUID;

import static com.laioffer.basic.serializable.IgnoreConstants.PATH;

import java.io.Serializable;

import androidx.annotation.NonNull;

import com.laioffer.basic.serializable.SerializeableUtils;

/**
 * SerialVersionUID 的理解
 * <p>
 * 1.没有定义 serialVersionUID
 * 2.User类中只有 name、age，没有nickName，对User类进行序列化
 */
public class Demo1 {

  public static void main(String[] args) {
    noSerialVersionUID();
  }

  private static void noSerialVersionUID() {
    User user = new User("张三", 18);
    SerializeableUtils.saveObject(user, PATH + "a.out");
    System.out.println("序列化: " + user);

    user = SerializeableUtils.readObject(PATH + "a.out");
    System.out.println("反序列化: " + user);
  }
}