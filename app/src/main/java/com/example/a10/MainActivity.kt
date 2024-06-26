package com.example.a10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        editText3 = findViewById(R.id.editText3)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            val text3 = editText3.text.toString()

            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("TEXT1", text1)
                putExtra("TEXT2", text2)
                putExtra("TEXT3", text3)
            }.apply {
                startActivity(this)
            }
        }
    }
}

class SecondActivity {

}
