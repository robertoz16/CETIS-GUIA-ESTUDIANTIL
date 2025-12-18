package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Encargados extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_encargados);
	}

	public void MenuPrincipal(View v){
    	Intent intent = new Intent(Encargados.this, MenuPrincipal.class);
    	startActivity(intent);
    }

}
