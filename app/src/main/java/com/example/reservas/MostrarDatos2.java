package com.example.reservas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos2 extends AppCompatActivity {

    TextView Tvnombre, Tvapellido, Tvcorreo, Tvtelefono, Tvfecha;
    Button OK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos2);

        // findViewById(R.id) es el metodo para encuentrar la vista por el ID

        Tvnombre = (TextView)findViewById(R.id.Tvnombre);
        Tvapellido = (TextView)findViewById(R.id.Tvapellido);
        Tvcorreo = (TextView)findViewById(R.id.Tvcorreo);
        Tvtelefono = (TextView)findViewById(R.id.Tvtelefono);
        Tvfecha = (TextView)findViewById(R.id.Tvfecha);
        OK = (Button)findViewById(R.id.btnok);


        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MostrarDatos2.this,MainActivity.class);
                startActivity(intent);

            }
        });

        mostrarDato();

    }



    private void mostrarDato() {  // metodo para mostrar los datos

        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String apellido = datos.getString("ape");
        String telefono = datos.getString("tel");
        String correo = datos.getString("cor");
        String fecha = datos.getString("feh");

        Tvnombre.setText(nombre);
        Tvapellido.setText(apellido);
        Tvcorreo.setText(correo);
        Tvtelefono.setText(telefono);
        Tvfecha.setText(fecha);


    }
}