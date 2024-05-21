package myproject.of.finddoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name)
        val nameEditText = findViewById<EditText>(R.id.username)
        val loginButton = findViewById<Button>(R.id.button)




        // Set a click listener on the login button
        loginButton.setOnClickListener {
            val name = nameEditText.text.toString()

            Toast.makeText(this, "Username: $name", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }
    }
}