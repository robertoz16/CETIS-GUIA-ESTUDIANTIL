package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Diseno extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diseno);
	}

	public void Especialidades(View v){
    	Intent intent = new Intent(Diseno.this, Especialidades.class);
    	startActivity(intent);
    }

}
