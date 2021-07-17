package com.example.reservas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, correo,telefono, fecha;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //es el metodo para encuentrar la vista por el ID

        nombre = (EditText)findViewById(R.id.txtnombre);
        apellido = (EditText)findViewById(R.id.txtapellido);
        correo = (EditText)findViewById(R.id.txtcorreo);
        telefono = (EditText)findViewById(R.id.txttelefono);
        fecha = (EditText)findViewById(R.id.txtfecha);
        enviar = (Button) findViewById(R.id.btnok);

        // Metodo para enviar los datos por medio el boton enviar
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nombre.getText().toString();
                String ape = apellido.getText().toString();
                String cor = correo.getText().toString();
                String tel = telefono.getText().toString();
                String feh = fecha.getText().toString();


                Intent i = new Intent(MainActivity.this,MostrarDatos2.class);

                i.putExtra("name", name );
                i.putExtra("ape", ape );
                i.putExtra("tel", tel );
                i.putExtra("cor", cor );
                i.putExtra("feh", feh );

                startActivity(i);
            }
        });




    }
}