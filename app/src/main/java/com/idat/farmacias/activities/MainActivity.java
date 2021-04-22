package com.idat.farmacias.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.idat.farmacias.R;
import com.idat.farmacias.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        mainBinding.btnmariano.setOnClickListener(this);
        mainBinding.btnestefani.setOnClickListener(this);
        mainBinding.btnluis.setOnClickListener(this);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(Class activity)
    {
        Intent i=new Intent(this, activity);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mainBinding.btnmariano.getId()) { goToActivity(LoginActivity.class); return; }
        if (v.getId() == mainBinding.btnestefani.getId()) { goToActivity(ListadoMedicamentosActivity.class); return; }
        if (v.getId() == mainBinding.btnluis.getId()) { goToActivity(ListadoDevsActivity.class); return; }
        if (v.getId() == mainBinding.btnQuienesSomos.getId()) { goToActivity(AcerdadeActivity.class); return; }
        Toast.makeText(this, "No existe esa opción",Toast.LENGTH_SHORT).show();
    }
}