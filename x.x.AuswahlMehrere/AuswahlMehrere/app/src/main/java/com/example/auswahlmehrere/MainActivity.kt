package com.example.auswahlmehrere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.auswahlmehrere.databinding.ActivityMainBinding
import android.view.View
import android.widget.AdapterView

class MainActivity : AppCompatActivity() {
    private lateinit var B: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityMainBinding.inflate(layoutInflater)
        setContentView(B.root)

        B.rgFarbe.setOnCheckedChangeListener { _, checkedId ->
            B.tvFarbe.text = when(checkedId) {
                B.rbRot.id -> "Klick auf Rot"
                B.rbGruen.id -> "Klick auf Grün"
                else -> "Klick auf Blau"
            }
        }

        B.buFarbeSetzen.setOnClickListener {
            B.rbBlau.isChecked = true
            B.tvFarbe.text = "Setzen: Blau"
        }

        B.buFarbeAusgabe.setOnClickListener {
            B.tvFarbe.text = when(B.rgFarbe.checkedRadioButtonId) {
                B.rbRot.id -> "Auswahl: Rot"
                B.rbGruen.id -> "Auswahl: Grün"
                else -> "Auswahl: Blau"
            }
        }

        B.spFarbe.setSelection(2)

        B.spFarbe.onItemSelectedListener =
                object:AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parent: AdapterView<*>?,
                            view: View?, position: Int, id: Long) {
                        val eintrag = parent?.getItemAtPosition(position)
                        B.tvSpinner.text = "Klick auf: $eintrag"
                    }
                    override fun onNothingSelected(
                            parent: AdapterView<*>?) {
                        B.tvSpinner.text = "-"
                    }
                }

        B.buSpinnerSetzen.setOnClickListener {
            B.spFarbe.setSelection(2)
            B.tvSpinner.text = "Setzen: Blau"
        }

        B.buSpinnerAusgabe.setOnClickListener {
            B.tvSpinner.text = "Auswahl: ${B.spFarbe.selectedItem}"
        }
    }
}
