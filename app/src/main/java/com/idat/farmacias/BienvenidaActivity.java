package com.idat.farmacias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.idat.farmacias.databinding.ActivityBienvenidaBinding;

public class BienvenidaActivity extends AppCompatActivity {



    private ActivityBienvenidaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityBienvenidaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String usur=getIntent().getStringExtra("usuario");
        binding.lblbienvenida.setText("Bienvenido  : " + usur);
    }
}