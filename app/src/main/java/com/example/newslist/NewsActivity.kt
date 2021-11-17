package com.example.newslist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        setTitle(getLocalClassName())

        val rollButton = findViewById<Button>(R.id.buttonDetail)

        val rollButton_two = findViewById<Button>(R.id.buttonLogout)

        rollButton.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }
        rollButton_two.setOnClickListener {
            val intent_two = Intent(this, LoginActivity::class.java)
            startActivity(intent_two)
        }
    }
    override fun onBackPressed() {

            finish()


    }
}