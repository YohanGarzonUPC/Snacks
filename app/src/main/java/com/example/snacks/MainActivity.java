package com.example.snacks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner tipos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] datos = getResources().getStringArray(R.array.tipos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);

        tipos = findViewById(R.id.spinner);
        tipos.setAdapter(adapter);

        Button boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String respuesta = "";
                String tipo = (String) tipos.getSelectedItem();
                switch (tipo){
                    case "Paquetes de papas":
                        respuesta="Margaritas\n" +
                                "Super ricas\n" +
                                "Doritos\n" +
                                "Choclitos";
                        break;
                    case "Gaseosas":
                        respuesta="Colombiana\n" +
                                "Postobon\n" +
                                "Pepsi\n" +
                                "CocaCola";
                        break;
                    case "Chocolatinas":
                        respuesta="Jet\n" +
                                "Jumbo";
                        break;
                    case "Ponques":
                        respuesta="Ramo\n" +
                                "Gala\n" +
                                "Gansito\n" +
                                "Chocoso";
                        break;
                }

                TextView impresion=findViewById(R.id.objetos);

                impresion.setText(respuesta);
            }
        });

    }
}