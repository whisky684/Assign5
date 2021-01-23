package com.example.assign5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var texts = textv.text.toString().toInt()

        add.setOnClickListener() {
            if (texts in 0..8) {
                texts += 1
                textv.setText(texts.toString())
            } else {
                Toast.makeText(applicationContext, "ไม่สามารถเพิ่มค่าได้มากกว่า 9", Toast.LENGTH_LONG)
                    .show()
            }

            minus.setOnClickListener() {
                if (texts in 1..9) {
                    texts -= 1
                    textv.setText(texts.toString())
                } else {
                    Toast.makeText(applicationContext, "ไม่สามารถลดค่าได้ต่ำกว่า 0", Toast.LENGTH_LONG)
                        .show()
                }
            }

            reset.setOnClickListener(){
                texts = 0
                textv.setText(texts.toString())
            }
        }
    }
}
