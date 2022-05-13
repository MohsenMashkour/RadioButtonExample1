package com.mkrdeveloper.radiobuttonexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rdb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rdb2 = findViewById<RadioButton>(R.id.radioButton2)

        val rdgp = findViewById<RadioGroup>(R.id.radioGroup2)

        rdb1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) Toast.makeText(this,"rdb1 checked",Toast.LENGTH_SHORT ).show()
        }
        rdb2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) Toast.makeText(this,"rdb2 checked",Toast.LENGTH_SHORT ).show()
        }

        rdgp.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButton3) Toast.makeText(this,"rdb3 checked",Toast.LENGTH_SHORT ).show()
            if (checkedId == R.id.radioButton4) Toast.makeText(this,"rdb4 checked",Toast.LENGTH_SHORT ).show()
        }
    }
}