package org.geeksforgeeks.restartactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view_1)
        val mButton = findViewById<Button>(R.id.button_1)

        val mRandom = Random()
        mTextView.text = mRandom.nextInt(50).toString()

        mButton.setOnClickListener {
            val mIntent = intent
            finish()
            startActivity(mIntent)
        }
    }
}