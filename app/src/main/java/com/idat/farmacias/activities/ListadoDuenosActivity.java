package com.idat.farmacias.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.idat.farmacias.R;
import com.idat.farmacias.adapters.ListadoDuenosAdapter;

public class ListadoDuenosActivity extends AppCompatActivity {
    String[] nombres;
    RecyclerView recyclerView;
    int[] images = {R.drawable.dueno_1, R.drawable.dueno_2, R.drawable.dueno_3, R.drawable.dueno_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_duenos);

        nombres = getResources().getStringArray(R.array.duenos);

        recyclerView = findViewById(R.id.rvDuenos);
        ListadoDuenosAdapter adapter = new ListadoDuenosAdapter(nombres, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}