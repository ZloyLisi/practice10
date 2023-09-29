package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablelayout)
        setTitle("TableLayout")

    }

    fun btnClick1(view: View) {
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)

        btn1.setOnClickListener{
            btn1.visibility = View.GONE
            btn2.visibility = View.VISIBLE
        }
        btn2.setOnClickListener{
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.VISIBLE
        }
    }

    fun btnClick2(view: View){
        var btn: Button? = null
        if(view is Button) btn = view as Button
        val textView1: TextView = findViewById(R.id.textView2)
        val textView2: TextView = findViewById(R.id.textView4)

        val parentLayout = btn?.parent as? LinearLayout
        val linerLayout1 :LinearLayout = findViewById(R.id.linearLayout1)
        val linerLayout2 :LinearLayout = findViewById(R.id.linearLayout2)
        val linerLayout3 :LinearLayout = findViewById(R.id.linearLayout3)

        when (btn?.text){
            "ORIENT" ->{
                if(parentLayout == linerLayout1){
                    textView1.text = if (linerLayout1.orientation == LinearLayout.HORIZONTAL) "Горизонтальная"
                    else "Вертикальная"
                }
                if(parentLayout == linerLayout2){
                    textView1.text = if (linerLayout2.orientation == LinearLayout.HORIZONTAL) "Горизонтальная"
                    else "Вертикальная"
                }
                if(parentLayout == linerLayout3){
                    textView1.text = if (linerLayout3.orientation == LinearLayout.HORIZONTAL) "Горизонтальная"
                    else "Вертикальная"
                }
            }
            "GRAVITY" ->{

                if(parentLayout == linerLayout1){
                    val layoutParams = linerLayout1.getLayoutParams() as LinearLayout.LayoutParams
                    textView2.text = when (layoutParams.gravity) {
                        Gravity.CENTER -> "по центру"
                        Gravity.RIGHT -> "по правой границе"
                        Gravity.LEFT -> "по левой границе"
                        else -> ""
                    }
                }
                if(parentLayout == linerLayout2){
                    val layoutParams = linerLayout2.getLayoutParams() as LinearLayout.LayoutParams
                    textView2.text = when (layoutParams.gravity) {
                        Gravity.CENTER -> "по центру"
                        Gravity.RIGHT -> "по правой границе"
                        Gravity.LEFT -> "по левой границе"
                        else -> ""
                    }
                }
                if(parentLayout == linerLayout3){
                    val layoutParams = linerLayout3.getLayoutParams() as LinearLayout.LayoutParams
                    textView2.text = when (layoutParams.gravity) {
                        Gravity.CENTER -> "по центру"
                        Gravity.RIGHT -> "по правой границе"
                        Gravity.LEFT -> "по левой границе"
                        else -> ""
                    }
                }
            }
        }
    }
}
