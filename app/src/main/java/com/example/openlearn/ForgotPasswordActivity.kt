package com.example.openlearn

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailEditText = findViewById<EditText>(R.id.email)
        val resetButton = findViewById<Button>(R.id.button_reset_password)

        resetButton.setOnClickListener {
            val email = emailEditText.text.toString()

            // Tambahkan logika reset password di sini
            Toast.makeText(this, "Instruksi reset password telah dikirim ke $email", Toast.LENGTH_SHORT).show()
        }
    }
}
