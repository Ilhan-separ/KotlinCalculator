package com.example.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    var num1 : Float? = null
    var num2 : Float? = null
    var sonuc : Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val sa ="as"

    }

    fun mySum(view : View){
        num1 = binding.editTextNum.text.toString().toFloatOrNull()
        num2 = binding.editTextNum2.text.toString().toFloatOrNull()
        if (num1 == null || num2 == null)
            binding.textView.text = "Lütfen sayı giriniz."
        else {
            sonuc = num1!! + num2!!
            binding.textView.text = "Sonuc : ${sonuc.toString()}"
        }
    }

    fun mySub(view : View){
        num1 = binding.editTextNum.text.toString().toFloatOrNull()
        num2 = binding.editTextNum2.text.toString().toFloatOrNull()
        if (num1 == null || num2 == null)
            binding.textView.text = "Lütfen sayı giriniz."
        else {
            sonuc = num1!! - num2!!
            binding.textView.text = "Sonuc : ${sonuc.toString()}"
        }
    }

    fun myMult(view : View){
        num1 = binding.editTextNum.text.toString().toFloatOrNull()
        num2 = binding.editTextNum2.text.toString().toFloatOrNull()
        if (num1 == null || num2 == null)
            binding.textView.text = "Lütfen sayı giriniz."
        else {
            sonuc = num1!! * num2!!
            binding.textView.text = "Sonuc : ${sonuc.toString()}"
        }
    }

    fun myDiv(view : View){
        num1 = binding.editTextNum.text.toString().toFloatOrNull()
        num2 = binding.editTextNum2.text.toString().toFloatOrNull()
        if (num1 == null || num2 == null)
            binding.textView.text = "Lütfen sayı giriniz."
        else {
            sonuc = num1!! / num2!!
            binding.textView.text = "Sonuc : ${sonuc.toString()}"
        }
    }



}