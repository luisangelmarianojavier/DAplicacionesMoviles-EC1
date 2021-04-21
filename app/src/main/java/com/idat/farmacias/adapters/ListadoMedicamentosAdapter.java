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

public class ListadoMedicamentosAdapter extends RecyclerView.Adapter<ListadoMedicamentosAdapter.MyViewHolder> {
    String data1[], data2[];
    int images[];
    Context context;

    public ListadoMedicamentosAdapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1=s1;
        data2=s2;
        images= img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.activity_listado_medicamentos, null, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount()
    {
        return images.length;
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvmedicamentos, myText1, myText2;
        ImageView myImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvmedicamentos=itemView.findViewById(R.id.rvmedicamentos);
            myText1=itemView.findViewById(R.id.listado_medicamentos_txt);
            myText2=itemView.findViewById(R.id.descripcion_txt);
            myImage=itemView.findViewById(R.id.myImage);
        }
    }
}
