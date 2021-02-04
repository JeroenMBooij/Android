package com.jeroen.booij.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val MFA_EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(MFA_EXTRA_MESSAGE, message)
//        }
//        val editText = findViewById<EditText>(R.id.editText)
//        val message = editText.text.toString()
//
//        startActivity(intent)

        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val sendIntent = Intent()
        sendIntent.setAction(Intent.ACTION_SEND)
        sendIntent.putExtra(Intent.EXTRA_TEXT, message)
        sendIntent.setType("text/plain")
        startActivity(sendIntent)
    }
}