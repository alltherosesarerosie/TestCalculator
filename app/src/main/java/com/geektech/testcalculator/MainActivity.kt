package com.geektech.testcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.testcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            btnPlus.setOnClickListener {
                resultTv.text = Math().summation(firstEt.text.toString(),secondEt.text.toString())
            }

            btnDiv.setOnClickListener {
                resultTv.text = Math().division(firstEt.text.toString(),secondEt.text.toString())
            }
        }
    }
}