package com.example.nuevos_en_cetis;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressLint("NewApi") public class MainActivity extends Activity {

    EditText edtControl, edtCurp;
    Button btnIniciarSesion, btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtControl = (EditText) findViewById(R.id.edtControl);
        edtCurp = (EditText) findViewById(R.id.edtCurp);
        btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String control = edtControl.getText().toString().trim();
                String curp = edtCurp.getText().toString().trim();

                if (control.isEmpty() || curp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingresa los datos requeridos", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this,  Principal.class);
                    startActivity(intent);
                }
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Registro.class));
            }
        });
    }
}
