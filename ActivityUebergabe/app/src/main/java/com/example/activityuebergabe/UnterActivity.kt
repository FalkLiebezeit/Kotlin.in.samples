package com.example.activityuebergabe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityuebergabe.databinding.ActivityUnterBinding

class UnterActivity : AppCompatActivity() {
    private lateinit var B: ActivityUnterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityUnterBinding.inflate(layoutInflater)
        setContentView(B.root)

        val z = if(intent.hasExtra("zHaupt"))
                    intent.getIntExtra("zHaupt", 0)
                else
                    0
        val x = if(intent.hasExtra("xHaupt"))
                    intent.getDoubleExtra("xHaupt", 0.0)
                else
                    0.0
        val t = if(intent.hasExtra("tHaupt"))
                    intent.getStringExtra("tHaupt")
                else
                    ""
        val a = if(intent.hasExtra("aHaupt"))
                    intent.getIntegerArrayListExtra("aHaupt")
                            as ArrayList<Int>
                else
                    arrayListOf()

        B.tvUnterAusgabe.text =
            "Unter-Activity: $z $x $t ${a.joinToString()}"
        B.buZurueck.setOnClickListener { finish() }
    }
}
