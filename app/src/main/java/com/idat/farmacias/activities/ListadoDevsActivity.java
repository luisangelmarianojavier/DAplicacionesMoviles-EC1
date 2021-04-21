package com.idat.farmacias.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.idat.farmacias.R;
import com.idat.farmacias.adapters.ListadoDevsAdapter;

public class ListadoDevsActivity extends AppCompatActivity {

    String[] apellidos, nombres;
    RecyclerView recyclerView;
    int[] images = {R.drawable.luis, R.drawable.maximo, R.drawable.abel, R.drawable.estefani, R.drawable.angel};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_devs);
        apellidos = getResources().getStringArray(R.array.apellidos);
        nombres = getResources().getStringArray(R.array.nombres);

        recyclerView = findViewById(R.id.listado_enfermeros);
        ListadoDevsAdapter adapter = new ListadoDevsAdapter(apellidos, nombres, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}