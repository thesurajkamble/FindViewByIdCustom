package com.surajkamble.findviewbyidcustom

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.surajkamble.findviewbyidcustom.custom.whereMyView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootview = findViewById<LinearLayout>(R.id.main_layout)

        rootview.whereMyView<TextView>(R.id.text_view)?.text = "some text "
    }
}