package com.example.a111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{
            if (textView.text.toString() == "0"){

                textView.setText("1")
            }
          else{
                var str = textView.text.toString().plus(1)
                textView.setText(str)

            }
        }
        btn2.setOnClickListener{
            if (textView.text.toString() == "0"){
            textView.setText("2")
            }
            else{
                var str = textView.text.toString().plus(2)
                textView.setText(str)
            }
        }
        btn3.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("3")
            }
            else{
                var str = textView.text.toString().plus(3)
                textView.setText(str)
            }
        }
        btn4.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("4")
            }
            else{
                var str = textView.text.toString().plus(4)
                textView.setText(str)
            }
        }
        btn5.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("5")
            }
            else{
                var str = textView.text.toString().plus(5)
                textView.setText(str)
            }
        }
        btn6.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("6")
            }
            else{
                var str = textView.text.toString().plus(6)
                textView.setText(str)
            }
        }
        btn7.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("7")
            }
            else{
                var str = textView.text.toString().plus(7)
                textView.setText(str)
            }
        }
        btn8.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("8")
            }
            else{
                var str = textView.text.toString().plus(8)
                textView.setText(str)
            }
        }
        btn9.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("9")
            }
            else{
                var str = textView.text.toString().plus(9)
                textView.setText(str)
            }
        }
        btn0.setOnClickListener{
            if (textView.text.toString() == "0"){

            }
            else {
                var str = textView.text.toString().plus(0)
                textView.setText(str)
            }
        }
        btnclear.setOnClickListener{
            textView.setText("0")
        }
        btndel.setOnClickListener{
            if(textView.text.toString().length<=1){
                textView.setText("0")
            }
            else if(textView.text.isNotEmpty()) {
                textView.text=textView.text.dropLast(1)
            }
            }
        }
    }
