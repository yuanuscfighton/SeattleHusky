package com.laioffer.basic.serializable.serialVersionUID;

import static com.laioffer.basic.serializable.IgnoreConstants.PATH;

import java.io.Serializable;

import androidx.annotation.NonNull;

import com.laioffer.basic.serializable.SerializeableUtils;

/**
 * SerialVersionUID 的理解
 * <p>
 * 1.有定义 serialVersionUID
 * 2.在Use类中，新增 nickName，对User类进行反序列化
 */
public class Demo4 {

  public static void main(String[] args) {
    noSerialVersionUID();
  }

  private static void noSerialVersionUID() {
    User1 user = SerializeableUtils.readObject(PATH + "a.out");
    System.out.println("反序列化: " + user);
  }
}