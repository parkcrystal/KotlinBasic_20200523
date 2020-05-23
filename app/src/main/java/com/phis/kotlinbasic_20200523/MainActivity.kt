package com.phis.kotlinbasic_20200523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener { 
            
//            로그로 버튼 이벤트 확인
//            Log.d("메인화면", "확인버튼 눌림")
            
            resultTxt.text = "버튼이 눌림"
        }
    }
}
