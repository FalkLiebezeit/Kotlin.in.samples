package com.example.bv1.fakultaet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //einfache Datentypen
    int n, i;
    long produkt;

    //komplexe Datentypen
    TextView fakultaetAusgeben;
    EditText zahlN;
    Button rechnen;

    //Listener
    View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Java- und xml-Datei werden verbunden.
        setContentView(R.layout.activity_main);

        //Oberflächenelemente werden den komplexen Datentypen zugewiesen.
            //Casting von View zu EditText.
        zahlN = (EditText) findViewById(R.id.editN);
            //Casting von View zu TextView.
        fakultaetAusgeben = (TextView) findViewById(R.id.ausgabeFakultaet);
            //Casting von View zu Button.
        rechnen = (Button) findViewById(R.id.button);

        //Programmablauf - gestartet durch den Klick des Buttons.
        listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Eingabe
                String zahlAText = zahlN.getText().toString();
                n = Integer.valueOf(zahlAText);

                //Verarbeitung und Ausgabe
                    //Produkt mit if begrenzen.
                if(n>0 && n <= 15) {
                    produkt = 1;
                    i = 1;
                    //Produkt mit der do-while-Schleife bilden.
                    do {
                        produkt *= i;
                        i++;
                    } while (i <= n);

                    fakultaetAusgeben.setText(String.valueOf(produkt));
                }
                else
                    fakultaetAusgeben.setText(R.string.fehler);
            }};

        //Button mit dem Listener verbinden.
        rechnen.setOnClickListener(listener);
    }
}

