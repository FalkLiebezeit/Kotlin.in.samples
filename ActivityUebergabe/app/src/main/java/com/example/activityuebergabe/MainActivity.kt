package com.example.activityuebergabe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.activityuebergabe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var B: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        B = ActivityMainBinding.inflate(layoutInflater)

        setContentView(B.root)

        val z = 42
        val x = 47.11
        val t = "Hallo Welt"
        val a = arrayListOf(12, 28, -5, 2)

        B.tvHauptAusgabe.text =
            "Main-Activity: $z $x $t ${a.joinToString()}"

        B.buUnter.setOnClickListener {

            val unter = Intent(this, UnterActivity::class.java)

            unter.putExtra("zHaupt", z)
            unter.putExtra("xHaupt", x)
            unter.putExtra("tHaupt", t)
            unter.putExtra("aHaupt", a)

            startActivity(unter)
        }
    }
}
