package com.example.testeeeeeeee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Tabalho 02"
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nha, SampleFragment()).commit()
    }
    fun fragmentMethod() {
        Toast.makeText(this@MainActivity, "Method called From Fragment",
                Toast.LENGTH_LONG).show()
    }
}