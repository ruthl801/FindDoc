package myproject.of.finddoc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val passwordEditText = findViewById<EditText>(R.id.editTextTextpassword)
        val loginButton = findViewById<Button>(R.id.button)




        // Set a click listener on the login button
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()


            Toast.makeText(this, "Email: $email\nPassword: $password", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }


    }
}