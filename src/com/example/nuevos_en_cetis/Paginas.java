package com.example.nuevos_en_cetis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Paginas extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_paginas);
	}

	public void MenuPrincipal(View v){
    	Intent intent = new Intent(Paginas.this, MenuPrincipal.class);
    	startActivity(intent);
    }

}
