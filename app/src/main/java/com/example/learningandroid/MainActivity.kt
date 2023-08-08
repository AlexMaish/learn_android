package com.example.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learningandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn15.setOnClickListener {
            calculate(15)
        }

        binding.btn18.setOnClickListener {
            calculate(18)
        }
        binding.btn20.setOnClickListener {
            calculate(20)}

    }

    private fun calculate(percentage: Int) {
        val amount = binding.edAmount.text.toString().toInt()
        val tip = (amount * percentage) / 100
        val totalBill = amount + tip
        val summary = "Tip= $percentage ,TotalBill= $totalBill"
        binding.txt1.text = summary
    }
}