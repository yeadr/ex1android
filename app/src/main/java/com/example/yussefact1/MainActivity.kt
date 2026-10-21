package com.example.yussefact1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.yussefact1.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Signup.setOnClickListener {
            val emailText = binding.email.editText?.text?.toString()?.lowercase()
            val pwdText = binding.pwd.editText?.text?.toString()

            if (emailText == "johnleans@email.com" && pwdText == "John1234") {
                Toast.makeText(this, "Login correcte", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login incorrecte", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
