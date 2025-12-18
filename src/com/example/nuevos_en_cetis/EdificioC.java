package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class EdificioC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edificio_c);
	}

	public void MenuPrincipal(View v){
    	Intent intent = new Intent(EdificioC.this, MenuPrincipal.class);
    	startActivity(intent);
    }

}
