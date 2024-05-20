package myproject.of.finddoc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)

        // Delay for 3 seconds and then move to the second page
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish the first activity so the user can't go back to it
        }, 3000) // 3000 milliseconds = 3 seconds




    }
}