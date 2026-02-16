package com.example.firstgitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "my name is amin ramezani", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 2", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 3", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 4", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 5", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 6", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 7", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 8", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 9", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 10", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 10", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 10", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 10", Toast.LENGTH_SHORT).show()


        android.widget.Toast.makeText(this, "i am in develop branch", Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this, "aliiiiiiiiii", Toast.LENGTH_SHORT).show()

        kotlin.io.println("amin")


    }
}