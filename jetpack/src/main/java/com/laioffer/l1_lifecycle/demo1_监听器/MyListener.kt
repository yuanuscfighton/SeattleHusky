package com.laioffer.l1_lifecycle.demo1_监听器

import android.util.Log

/**
 * 类描述: 自定义监听器 → MyListener 可以监听 Demo1Activity 生命周期变化
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class MyListener {

  private val TAG = MyListener::class.java.simpleName

  /* MyListener是观察者，可以监听 Demo1Activity 生命周期，当触发了 Demo1Activity # onStart()生命周期函数，就会输出 “start invoked ...” */
  fun start() = Log.e(TAG, "start invoked ...")

  fun stop() = Log.e(TAG, "stop invoked ...")
}