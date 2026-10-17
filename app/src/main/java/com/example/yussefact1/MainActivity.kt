package com.example.yussefact1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.yussefact1.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val signup: Button = findViewById(R.id.Signup)
        val email = findViewById<TextInputLayout>(R.id.email).editText
        val pwd = findViewById<TextInputLayout>(R.id.pwd).editText

        signup.setOnClickListener {
            if(email!!.text.toString().lowercase() == "johnleans@email.com"
                && pwd!!.text.toString().lowercase() == "John1234"){
                Toast.makeText(this, "Login correcte", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
