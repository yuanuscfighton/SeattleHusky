package com.laioffer.l1_lifecycle.demo4

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * 类的描述: 中间层，继承 LifecycleObserver，提供生命周期回调
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
interface IPresenter : LifecycleObserver {

  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
  fun onResume()

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  fun onPause()
}