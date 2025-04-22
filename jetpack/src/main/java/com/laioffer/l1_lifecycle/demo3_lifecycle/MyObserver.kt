package com.laioffer.l1_lifecycle.demo3_lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * 类的描述: 观察者 -- 眼睛，但这双眼睛(MyObserver)必须实现 LifecycleObserver 接口
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class MyObserver : LifecycleObserver {

  private val TAG = MyObserver::class.java.simpleName

  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
  fun connectListener() = Log.e(TAG, "connectListener run ...")

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  fun disconnectListener() = Log.e(TAG, "disconnectListener run ...")
}