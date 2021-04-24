package com.idat.farmacias.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.idat.farmacias.R;
import com.idat.farmacias.databinding.ActivityDetalleMedicamentoBinding;
import com.idat.farmacias.models.Medicamento;

import java.util.Random;

public class DetalleMedicamentoActivity extends AppCompatActivity {

    private ActivityDetalleMedicamentoBinding detalleMedicamentoBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detalleMedicamentoBinding = ActivityDetalleMedicamentoBinding.inflate(getLayoutInflater());
        setContentView(detalleMedicamentoBinding.getRoot());
        // Obteniendo el objeto a través del intent
        Medicamento medicamento = (Medicamento) getIntent().getSerializableExtra("medicamento");
        detalleMedicamentoBinding.medicamentoImage.setImageResource(medicamento.image);
        detalleMedicamentoBinding.medicamentoName.setText(medicamento.nombre);
        detalleMedicamentoBinding.price.setText("S/ " + String.valueOf(new Random().nextDouble()*100).substring(0,5));
        detalleMedicamentoBinding.stock.setText(String.valueOf(new Random().nextInt(50)));
    }
}
