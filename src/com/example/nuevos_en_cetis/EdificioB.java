package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class EdificioB extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edificio_b);
	}

	public void MenuPrincipal(View v){
    	Intent intent = new Intent(EdificioB.this, MenuPrincipal.class);
    	startActivity(intent);
    }

}
