package com.laioffer.l1_lifecycle.demo3_lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * 类描述: 观察者，继承 DefaultLifecycleObserver
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class MyObserver1 : DefaultLifecycleObserver { // 使用 DefaultLifecycleObserver 好处是 可以拿到Activity/Fragment的所有环境

  private val TAG = MyObserver1::class.java.simpleName

  override fun onCreate(owner: LifecycleOwner) {
    super.onCreate(owner)
    Log.e(TAG, "onCreate()")
  }

  override fun onResume(owner: LifecycleOwner) {
    super.onResume(owner)
    Log.e(TAG, "onResume()")
  }
}