package com.idat.farmacias.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.idat.farmacias.adapters.ListadoMedicamentosAdapter;
import com.idat.farmacias.R;
import com.idat.farmacias.models.Medicamento;

public class ListadoMedicamentosActivity extends AppCompatActivity implements ListadoMedicamentosAdapter.OnMedicamentoClickListener {
    RecyclerView recyclerView;

    String sl[], s2[];
    int images[]={R.drawable.amoxicilina, R.drawable.cafalexina, R.drawable.clotrimazol,
            R.drawable.fluconazol, R.drawable.ibuprofeno, R.drawable.loratadina, R.drawable.naproxeno,
            R.drawable.omeprazol, R.drawable.paracetamol, R.drawable.salbutamol};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicamentos);
        sl= getResources().getStringArray(R.array.listado_medicamentos);
        s2= getResources().getStringArray(R.array.descripcion);

        recyclerView = (RecyclerView) findViewById(R.id.rvmedicamentos);
        ListadoMedicamentosAdapter myAdapter= new ListadoMedicamentosAdapter(this, sl, s2, images, this);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onMedicamentoClick(int position) {
        Medicamento medicamento = new Medicamento(sl[position], s2[position], images[position]);
        Intent intent = new Intent(this, DetalleMedicamentoActivity.class);
        intent.putExtra("medicamento", medicamento);
        startActivity(intent);
    }
}
