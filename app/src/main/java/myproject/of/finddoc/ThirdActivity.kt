package myproject.of.finddoc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import myproject.of.finddoc.R

class ThirdActivity : AppCompatActivity() {

    private lateinit var tvMale: TextView
    private lateinit var tvFemale: TextView
    private lateinit var btnNext: Button
    private var selectedGender: String? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gender)

        tvMale = findViewById(R.id.tvMale)
        tvFemale = findViewById(R.id.tvFemale)
        btnNext = findViewById(R.id.button)

        tvMale.setOnClickListener {
            selectGender("Male")
        }

        tvFemale.setOnClickListener {
            selectGender("Female")
        }

        btnNext.setOnClickListener {
            if (selectedGender != null) {
                // Proceed to the next activity or perform the desired action
                Toast.makeText(this, "Selected Gender: $selectedGender", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }

    private fun selectGender(gender: String) {
        selectedGender = gender
        tvMale.isSelected = gender == "Male"
        tvFemale.isSelected = gender == "Female"
    }
}
