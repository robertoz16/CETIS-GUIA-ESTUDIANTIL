package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View;

public class MenuPrincipal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);
	}

	
	
	public void MainActivity(View v){
    	Intent intent = new Intent(MenuPrincipal.this, MainActivity.class);
    	startActivity(intent);
    }
	public void Especialidades(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Especialidades.class);
    	startActivity(intent);
    }
	public void Paginas(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Paginas.class);
    	startActivity(intent);
    }
	public void Cosmetologia(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Cosmetologia.class);
    	startActivity(intent);
    }
	public void Diseno(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Diseno.class);
    	startActivity(intent);
    }
	public void Distraccion(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Distraccion.class);
    	startActivity(intent);
    }
	public void EdificioA(View v){
    	Intent intent = new Intent(MenuPrincipal.this, EdificioA.class);
    	startActivity(intent);
    }
	public void EdificioB(View v){
    	Intent intent = new Intent(MenuPrincipal.this, EdificioB.class);
    	startActivity(intent);
    }
	public void EdificioC(View v){
    	Intent intent = new Intent(MenuPrincipal.this, EdificioC.class);
    	startActivity(intent);
    }
	public void Medios(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Medios.class);
    	startActivity(intent);
    }
	public void Programacion(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Programacion.class);
    	startActivity(intent);
    }
	public void Encargados(View v){
    	Intent intent = new Intent(MenuPrincipal.this, Encargados.class);
    	startActivity(intent);
    }
}

