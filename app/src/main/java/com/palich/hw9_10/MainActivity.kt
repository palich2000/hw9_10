package com.palich.hw9_10

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    private var value: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonAdd: Button = findViewById(R.id.button_add)

        buttonAdd.setOnClickListener {
            value++
            toText(value.toString())
        }

        val buttonSub: Button = findViewById(R.id.button_sub)
        buttonSub.setOnClickListener {

            if (value == 0) {
                showToast("Value must be great then 0")
            } else {
                value--
                toText(value.toString())
            }
        }

    }

    private fun toText(text: String) {
        val textView: TextView = findViewById(R.id.textView)
        textView.text = text
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}