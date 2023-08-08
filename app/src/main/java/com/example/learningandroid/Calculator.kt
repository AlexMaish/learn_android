package com.example.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learningandroid.databinding.ActivityCalculatorBinding

class Calculator : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }
}