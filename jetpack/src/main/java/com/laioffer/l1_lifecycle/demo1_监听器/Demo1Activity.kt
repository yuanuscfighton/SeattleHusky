package com.laioffer.l1_lifecycle.demo1_监听器

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laioffer.jetpack.R

/**
 * 类的描述: 版本1: 使用自定义监听器 来监听生命周期
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class Demo1Activity : AppCompatActivity() {

  /* 如果没有Lifecycle，就需要自定义监听器，监听生命周期变化 */
  private var myListener: MyListener? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.empty_layout)

    myListener = MyListener()
  }

  override fun onStart() {
    super.onStart()
    // 没有使用Lifecycle，就需要自己监听生命周期
    myListener?.start()
  }

  override fun onStop() {
    super.onStop()
    myListener?.stop()
  }
}