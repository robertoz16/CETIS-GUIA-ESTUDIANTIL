package com.example.nuevos_en_cetis;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void MenuPrincipal(View v){
    	Intent intent = new Intent(Principal.this, MenuPrincipal.class);
    	startActivity(intent);
    }
    public void salirDeLaApp(View v){
    	finishAffinity();
    	System.exit(0);
    }
    
}

