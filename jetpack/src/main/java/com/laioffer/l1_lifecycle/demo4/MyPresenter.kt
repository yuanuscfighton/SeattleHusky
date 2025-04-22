package com.laioffer.l1_lifecycle.demo4

import android.util.Log

/**
 * 类的描述: 以后可能会有很多子类，例如 MyPresenter、MyPresenter1、MyPresenter2
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class MyPresenter : IPresenter {
  override fun onResume() {
    Log.d("TAG", "Lifecycle call onResume")
  }

  override fun onPause() {
    Log.d("TAG", "Lifecycle call onPause")
  }
}