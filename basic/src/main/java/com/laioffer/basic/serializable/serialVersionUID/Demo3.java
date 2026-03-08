package com.laioffer.basic.serializable.serialVersionUID;

import static com.laioffer.basic.serializable.IgnoreConstants.PATH;

import com.laioffer.basic.serializable.SerializeableUtils;

/**
 * SerialVersionUID 的理解
 * <p>
 * 1.有定义 serialVersionUID
 * 2.User类中只有 name、age，没有nickName，对User类进行序列化
 */
public class Demo3 {

  public static void main(String[] args) {
    hasSerialVersionUID();
  }

  private static void hasSerialVersionUID() {
    // 通过 IO 流辅助序列化的
    User1 user = new User1("张三", 18);
    SerializeableUtils.saveObject(user, PATH + "a.out");
    System.out.println("序列化: " + user);

    user = SerializeableUtils.readObject(PATH + "a.out");
    System.out.println("反序列化: " + user);
  }
}