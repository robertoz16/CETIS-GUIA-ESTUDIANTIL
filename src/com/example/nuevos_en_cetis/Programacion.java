package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Programacion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_programacion);
	}

	public void Especialidades(View v){
    	Intent intent = new Intent(Programacion.this, Especialidades.class);
    	startActivity(intent);
    }

}
