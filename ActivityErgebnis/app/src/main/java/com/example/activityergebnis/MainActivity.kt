package com.example.activityergebnis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Intent

import com.example.activityergebnis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var B: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        B = ActivityMainBinding.inflate(layoutInflater)
        setContentView(B.root)

        B.buUnterEins.setOnClickListener {

            val unterEins = Intent(this,
                    UnterEinsActivity::class.java)

            startActivityForResult(unterEins, 1)

        }

        B.buUnterZwei.setOnClickListener {

            val unterZwei = Intent(this,
                    UnterZweiActivity::class.java)

            startActivityForResult(unterZwei, 2)

        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int,
                                  resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK &&
                    data != null) {
                if (data.hasExtra("zUnterEins")) {
                    val rueckgabe =
                            data.getIntExtra("zUnterEins", 0)
                    B.tvRueckgabe.text = "Rückgabe aus Eins: $rueckgabe"
                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                B.tvRueckgabe.text = "Keine Rückgabe aus Eins"
            }

        } else if (requestCode == 2) {
            if (resultCode == Activity.RESULT_OK &&
                    data != null) {
                if (data.hasExtra("zUnterZwei")) {
                    val rueckgabe =
                            data.getIntExtra("zUnterZwei", 0)
                    B.tvRueckgabe.text = "Rückgabe aus Zwei: $rueckgabe"
                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                B.tvRueckgabe.text = "Keine Rückgabe aus Zwei"
            }
        }
    }


}
