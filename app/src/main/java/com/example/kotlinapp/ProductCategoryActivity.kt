package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product_category.*

class ProductCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_category)
        onClicklistener()
    }

    fun onClicklistener() {
        card1.setOnClickListener {
            startActivity(Intent(this, Product1Activity::class.java).putExtra("product1", String()))

        }
        card2.setOnClickListener {
            startActivity(Intent(this, Product1Activity::class.java).putExtra("product1", String()))

        }
        card3.setOnClickListener {

        }
        card4.setOnClickListener {

        }
        card5.setOnClickListener {

        }
        card6.setOnClickListener {

        }
        card7.setOnClickListener {

        }
        card8.setOnClickListener {

        }


    }
}