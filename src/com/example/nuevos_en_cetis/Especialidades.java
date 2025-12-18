package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Especialidades extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_especialidades);
	}

	public void MenuPrincipal(View v){
    	Intent intent = new Intent(Especialidades.this, MenuPrincipal.class);
    	startActivity(intent);
    }
	public void Programacion(View v){
    	Intent intent = new Intent(Especialidades.this, Programacion.class);
    	startActivity(intent);
    }
	public void Diseno(View v){
    	Intent intent = new Intent(Especialidades.this, Diseno.class);
    	startActivity(intent);
    }
	public void Medios(View v){
    	Intent intent = new Intent(Especialidades.this, Medios.class);
    	startActivity(intent);
    }
	public void Cosmetologia(View v){
    	Intent intent = new Intent(Especialidades.this, Cosmetologia.class);
    	startActivity(intent);
    }

}
