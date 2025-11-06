package com.example.activityergebnis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import com.example.activityergebnis.databinding.ActivityUnterZweiBinding

class UnterZweiActivity : AppCompatActivity() {
    private lateinit var B: ActivityUnterZweiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityUnterZweiBinding.inflate(layoutInflater)
        setContentView(B.root)

        setResult(Activity.RESULT_CANCELED, intent)

        B.buZurueckOk.setOnClickListener {
            intent.putExtra("zUnterZwei", 20)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        B.buZurueckAbbruch.setOnClickListener {
            setResult(Activity.RESULT_CANCELED, intent)
            finish()
        }
    }
}
