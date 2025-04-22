package com.laioffer.l1_lifecycle.demo4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laioffer.jetpack.R

/**
 * 类的描述: 版本5: 接口监听法
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class Demo4Activity : AppCompatActivity() {

  private var myPresenter: IPresenter? = null
  private var myPresenter1: IPresenter? = null
  private var myPresenter2: IPresenter? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.empty_layout)

    myPresenter = MyPresenter() // 用户端只需要面向接口编程，想用哪个实现类，直接new那个实现类
    lifecycle.addObserver(myPresenter!!)

    myPresenter1 = MyPresenter1()
    lifecycle.addObserver(myPresenter1!!)
  }
}