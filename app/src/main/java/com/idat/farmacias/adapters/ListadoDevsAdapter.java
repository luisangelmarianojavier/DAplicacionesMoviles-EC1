package com.idat.farmacias.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.idat.farmacias.R;

public class ListadoDevsAdapter extends RecyclerView.Adapter<ListadoDevsAdapter.ViewHolder> {

    private String[] apellidos;
    private String[] nombres;
    private int[] images;

    public ListadoDevsAdapter(String[] a, String[] n, int[] ids) {
        apellidos = a;
        nombres = n;
        images = ids;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.enfermero_card, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.apellido.setText(apellidos[position]);
        holder.nombre.setText(nombres[position]);
        holder.imagen.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return apellidos.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView apellido, nombre;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            apellido = itemView.findViewById(R.id.enfermero_apellidos);
            nombre = itemView.findViewById(R.id.enfermero_nombres);
            imagen = itemView.findViewById(R.id.enfermero_image);
        }
    }
}
