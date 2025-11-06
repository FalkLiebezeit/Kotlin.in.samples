package com.example.activityergebnis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import com.example.activityergebnis.databinding.ActivityUnterEinsBinding

class UnterEinsActivity : AppCompatActivity() {
    private lateinit var B: ActivityUnterEinsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        B = ActivityUnterEinsBinding.inflate(layoutInflater)
        setContentView(B.root)

        setResult(Activity.RESULT_CANCELED, intent)

        B.buZurueckOk.setOnClickListener {
            intent.putExtra("zUnterEins", 10)

            setResult(Activity.RESULT_OK, intent)

            finish()
        }

        B.buZurueckAbbruch.setOnClickListener {
            finish()
        }

    }
}
