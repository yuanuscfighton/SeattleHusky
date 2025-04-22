package com.laioffer.l1_lifecycle.demo2_mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laioffer.jetpack.R

/**
 * 类描述: 版本2: MVP，通过P层 监听生命周期函数
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class Demo2Activity : AppCompatActivity() {

  private var mMyPresenter: MyPresenter? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.empty_layout)

    mMyPresenter = MyPresenter()
  }

  override fun onResume() {
    super.onResume()
    mMyPresenter?.onResume()
  }

  override fun onPause() {
    super.onPause()
    mMyPresenter?.onPause()
  }
}