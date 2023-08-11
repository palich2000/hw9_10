package com.palich.hw9_10

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    private val MIN_VAL =   1
    private var value: Int = MIN_VAL
    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonAdd: Button = findViewById(R.id.button_add)
        toast = Toast(this)
        toast?.duration = Toast.LENGTH_SHORT

        buttonAdd.setOnClickListener {
            value++
            if (toast != null) {
                displayToast("Value is $value")
            }
        }

        val buttonSub: Button = findViewById(R.id.button_sub)
        buttonSub.setOnClickListener {

            if (value <= MIN_VAL) {
                displayToast("Value must be greater than one")
            } else {
                value--
                displayToast("Value is $value")
            }
        }

    }

    private fun displayToast(text: String) {
        //toast?.cancel()
        toast?.setText(text)
        toast?.show()
    }

}