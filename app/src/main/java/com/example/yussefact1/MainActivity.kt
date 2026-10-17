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

        setContentView(R.layout.activity_main)

        val signup: Button = findViewById(R.id.Signup)
        val email = findViewById<TextInputLayout>(R.id.email).editText
        val pwd = findViewById<TextInputLayout>(R.id.pwd).editText

        signup.setOnClickListener {
            val emailText = email?.text?.toString()?.lowercase()
            val pwdText = pwd?.text?.toString()

            if (emailText == "johnleans@email.com" && pwdText == "John1234") {
                Toast.makeText(this, "Login correcte", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login incorrecte", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
