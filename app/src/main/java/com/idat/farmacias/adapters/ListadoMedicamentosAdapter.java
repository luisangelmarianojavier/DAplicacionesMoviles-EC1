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
    private OnMedicamentoClickListener mOnMedicamentoClickListener;

    public ListadoMedicamentosAdapter(Context ct, String s1[], String s2[], int img[], OnMedicamentoClickListener listener){
        context = ct;
        data1=s1;
        data2=s2;
        images= img;
        mOnMedicamentoClickListener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.activity_listado_medicamentos, null, false);
        return new MyViewHolder(view, mOnMedicamentoClickListener);
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

    public  class  MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvmedicamentos, myText1, myText2;
        ImageView myImage;
        OnMedicamentoClickListener listener;

        public MyViewHolder(@NonNull View itemView, OnMedicamentoClickListener onClickListener) {
            super(itemView);
            tvmedicamentos=itemView.findViewById(R.id.rvmedicamentos);
            myText1=itemView.findViewById(R.id.listado_medicamentos_txt);
            myText2=itemView.findViewById(R.id.descripcion_txt);
            myImage=itemView.findViewById(R.id.myImage);
            listener = onClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onMedicamentoClick(getAdapterPosition());
        }
    }

    public interface OnMedicamentoClickListener {
        void onMedicamentoClick(int position);
    }

}
