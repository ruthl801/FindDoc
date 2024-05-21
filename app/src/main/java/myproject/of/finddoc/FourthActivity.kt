package myproject.of.finddoc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    private lateinit var npAge: NumberPicker
    private lateinit var btnNext: Button
    private var selectedAge: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.age)

        npAge = findViewById(R.id.npAge)
        btnNext = findViewById(R.id.button)

        // Configure the NumberPicker
        npAge.minValue = 1
        npAge.maxValue = 90
        npAge.wrapSelectorWheel = true
        npAge.setOnValueChangedListener { _, _, newVal ->
            selectedAge = newVal
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }



    }
}


