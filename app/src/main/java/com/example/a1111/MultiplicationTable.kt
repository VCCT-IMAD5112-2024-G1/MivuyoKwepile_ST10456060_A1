package com.example.a1111

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
val multiplyButton = findViewById<Button>(R.id.multiplyButton)
val tableNumberEditText =
    findViewById<EditText>(R.id.tableNumberEditText)
multiplyButton.setOnClickListener {
// create the explicit intent
    val intent = Intent(this, MultiplicationTable::class.java)
// add the table number to the intent
    intent.putExtra("tableNumber",
        tableNumberEditText.text.toString())
// start your next activity
    startActivity(intent)

}
