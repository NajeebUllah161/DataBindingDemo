package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val quoteObj = Quote("Never Give Up","Najeeb")
        binding.quote = quoteObj

        // Casting Button
        button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this, "Touched a Button", Toast.LENGTH_LONG).show()
            val quoteObj =  Quote("As u so, so shall you reap", "Anonymous")
            binding.quote = quoteObj

        })


    }
}