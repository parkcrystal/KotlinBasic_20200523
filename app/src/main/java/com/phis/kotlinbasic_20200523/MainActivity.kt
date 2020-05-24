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

//            EditText에 적혀있는 내용을 String으로 변환 (우측)
//            inputContent 이름의 저장공간을 생성 (좌측)
//            우측의 값을 => 좌측의 공간에 복사
            val inputContent = inputEdt.text.toString()

            resultTxt.text = "버튼이 눌림"
        }
    }
}
