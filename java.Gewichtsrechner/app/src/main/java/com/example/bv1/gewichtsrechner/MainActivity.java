package com.example.bv1.gewichtsrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //einfache Datentypen
    int groesse;
    int gewicht;

    //komplexe Datentypen
    EditText groesseEingeben;
    Button rechnen;
    TextView gewichtZeigen;

    //Listener
    View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Die Java-Klasse wird mit der xml-Datei (Layout der Oberfläche) verbunden.
        setContentView(R.layout.activity_main);

        //Oberflächenelemente werden den komplexen Datentypen zuwiesen.
            //Casting von View zu EditText.
        groesseEingeben = (EditText) findViewById(R.id.editText);

            //Casting von View zu Button.
        rechnen = (Button) findViewById(R.id.button);

            //Casting von View zu TextView.
        gewichtZeigen = (TextView) findViewById(R.id.textView3);

        //Programmablauf - gestartet durch den Klick des Buttons.
        listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Eingabe

                String groeßeText = groesseEingeben.getText().toString();
                groesse = Integer.valueOf(groeßeText);

                //Verarbeitung
                gewicht = groesse - 100;

                //Ausgabe
                String gewichtText = String.valueOf(gewicht);
                gewichtZeigen.setText(gewichtText);

            }
        };

        //Button mit dem Listener verbinden.
        rechnen.setOnClickListener(listener);
    }}


