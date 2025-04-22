package com.laioffer.l1_lifecycle.source

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laioffer.jetpack.R

/**
 * 类描述: 被观察者 Observable
 *
 * created by 西伯利亚哈士奇 on 2025/4/22 07:10
 */
class SourceActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.empty_layout)

    lifecycle.addObserver(MyLocationListener())
  }

  override fun onStart() {
    super.onStart()
  }
}