package com.laioffer.l1_lifecycle.demo3_lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laioffer.jetpack.R

/**
 * 类描述: 使用 LifecycleOwner 和 LifecycleObserver 实现
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class Demo3Activity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.empty_layout)

    /* 2.这里我们只需要创建一个观察者，盯着 Demo3Activity 看就行 */
    lifecycle.addObserver(MyObserver())
    // 可以增加多个眼睛 MyObserver1
    lifecycle.addObserver(MyObserver1())
  }

  /* 1.由于 AppCompatActivity 实现了 LifecycleOwner 接口，我们就不需要再写👇🏻的代码了 */
  // override fun onResume() {
  //   super.onResume()
  //   mMyPresenter?.onResume()
  // }
}