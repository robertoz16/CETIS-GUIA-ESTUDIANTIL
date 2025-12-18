package com.example.nuevos_en_cetis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends Activity {

    EditText edtMatricula, edtCurpRegistro;
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtMatricula = (EditText) findViewById(R.id.edtMatricula);
        edtCurpRegistro = (EditText) findViewById(R.id.edtCurpRegistro);
        btnVolver = (Button) findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registro.this, MainActivity.class));
                finish();
            }
        });
    }
}