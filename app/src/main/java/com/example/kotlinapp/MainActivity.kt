package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_product_category.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message="Hello World"
        val duration= Toast.LENGTH_LONG
        val toast=Toast.makeText(applicationContext,message,duration);
        toast.show()

    }
//    fun onClicklistener(){
//        card1.setOnClickListener{
//            startActivity(Intent(this,Product1Activity::class.java).putExtra("product1",String()))
//
//        }
//        card2.setOnClickListener{
//
//        }
//        card3.setOnClickListener{
//
//        }
//        card4.setOnClickListener{
//
//        }
//        card5.setOnClickListener{
//
//        }
//        card6.setOnClickListener{
//
//        }
//        card7.setOnClickListener{
//
//        }
//        card8.setOnClickListener{
//
//        }
//
//    }
}