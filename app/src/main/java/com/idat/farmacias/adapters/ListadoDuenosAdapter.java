package com.idat.farmacias.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.idat.farmacias.R;

public class ListadoDuenosAdapter extends RecyclerView.Adapter<ListadoDuenosAdapter.ViewHolder> {
    private String[] nombres;
    private int[] images;

    public ListadoDuenosAdapter(String[] nombres, int[] images) {
        this.nombres = nombres;
        this.images = images;
    }

    @NonNull
    @Override
    public ListadoDuenosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.enfermero_card, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListadoDuenosAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(nombres[position]);
        holder.imagen.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return nombres.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.enfermero_nombres);
            imagen = itemView.findViewById(R.id.enfermero_image);

        }
    }
}
